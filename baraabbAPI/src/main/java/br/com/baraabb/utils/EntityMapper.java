package br.com.baraabb.utils;

import org.modelmapper.ModelMapper;

public class EntityMapper {

	private static ModelMapper modelMapper = new ModelMapper();

	public static <E, D> D convertToDto(E entity, Class<D> dtoClass) {
		return modelMapper.map(entity, dtoClass);
	}

	public static <E, D> D convertToEntity(E DTO, Class<D> entityClass) {
		return modelMapper.map(DTO, entityClass);
	}

}
