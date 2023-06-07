package br.com.baraabb.service;

import javax.ws.rs.core.Response;

/**
 * 
 * @author biasi
 *
 * @param <DTO> dto Entide
 * @param <ID> Tipo id entidade
 */

public interface IGenericService<DTO, ID> {
	
	public DTO find(ID idDto);
	
	public Response update(DTO dto);
	
	public Response delete(ID id);
	
	public Response insert(DTO dto);

}
