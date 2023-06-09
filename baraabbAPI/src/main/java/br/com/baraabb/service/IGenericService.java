package br.com.baraabb.service;

import br.com.baraabb.DTO.AbstractDTO;
import br.com.baraabb.model.AbstractEntity;

/**
 * 
 * @author biasi
 *
 * @param <DTO> dto Entide
 * @param <ID> Tipo id entidade
 */

public interface IGenericService<DTO extends AbstractDTO, E extends AbstractEntity, ID> {
	
	public DTO find(ID idDto);
	
	public void update(DTO dto);
	
	public void delete(ID id);
	
	public void insert(DTO dto);
	
	public E conversor(DTO dto);
	
	public void validador(E entity);

}
