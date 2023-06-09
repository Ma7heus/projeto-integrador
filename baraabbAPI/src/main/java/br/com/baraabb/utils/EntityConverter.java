package br.com.baraabb.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EntityConverter {

    public <DTO> DTO convertEntityToDTO(Object entity, Class<DTO> dtoClass) throws Exception {
    	DTO dto = createInstance(dtoClass);
        Field[] entityFields = entity.getClass().getDeclaredFields();
        Field[] dtoFields = dtoClass.getDeclaredFields();

        for (Field entityField : entityFields) {
            String fieldName = entityField.getName();
            Field dtoField = findFieldByName(dtoFields, fieldName);
            if (dtoField != null) {
                Method entityGetter = getGetterMethod(entity.getClass(), fieldName);
                Method dtoSetter = getSetterMethod(dtoClass, fieldName, dtoField.getType());

                if (entityGetter != null && dtoSetter != null) {
                    Object value = entityGetter.invoke(entity);
                    dtoSetter.invoke(dto, value);
                }
            }
        }

        return dto;
    }

    private static Field findFieldByName(Field[] fields, String fieldName) {
        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }
        return null;
    }

    private static Method getGetterMethod(Class<?> clazz, String fieldName) throws NoSuchMethodException {
        String getterName = "get" + capitalize(fieldName);
        try {
            return clazz.getMethod(getterName);
        } catch (NoSuchMethodException e) {
            // Try isXXX method for boolean fields
            getterName = "is" + capitalize(fieldName);
            return clazz.getMethod(getterName);
        }
    }

    private static Method getSetterMethod(Class<?> clazz, String fieldName, Class<?> fieldType) throws NoSuchMethodException {
        String setterName = "set" + capitalize(fieldName);
        try {
            return clazz.getMethod(setterName, fieldType);
        } catch (NoSuchMethodException e) {
            // Try setXXX method for boolean fields
            setterName = "set" + capitalize(fieldName);
            return clazz.getMethod(setterName, fieldType);
        }
    }

    private static String capitalize(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private static <T> T createInstance(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }
}
