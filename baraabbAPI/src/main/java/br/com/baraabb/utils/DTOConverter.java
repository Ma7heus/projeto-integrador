package br.com.baraabb.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DTOConverter {

    public static <T> T convertDTOToEntity(Object dto, Class<T> entityClass) throws Exception {
        T entity = entityClass.newInstance();
        Field[] dtoFields = dto.getClass().getDeclaredFields();
        Field[] entityFields = entityClass.getDeclaredFields();

        for (Field dtoField : dtoFields) {
            String fieldName = dtoField.getName();
            Field entityField = findFieldByName(entityFields, fieldName);
            if (entityField != null) {
                Method dtoGetter = getGetterMethod(dto.getClass(), fieldName);
                Method entitySetter = getSetterMethod(entityClass, fieldName, entityField.getType());

                if (dtoGetter != null && entitySetter != null) {
                    Object value = dtoGetter.invoke(dto);
                    entitySetter.invoke(entity, value);
                }
            }
        }

        return entity;
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
}
