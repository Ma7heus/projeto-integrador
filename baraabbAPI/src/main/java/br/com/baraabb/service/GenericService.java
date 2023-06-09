package br.com.baraabb.service;

import br.com.baraabb.DTO.AbstractDTO;
import br.com.baraabb.model.AbstractEntity;

/**
 * 
 * @author biasi
 *
 * @param <T>
 * @param <ID>
 */

public abstract class GenericService<DTO extends AbstractDTO,E extends AbstractEntity, ID> implements IGenericService<DTO, E, ID> {
 
}
