package br.com.baraabb.service;

import javax.enterprise.inject.spi.CDIProvider;
import javax.ws.rs.core.Response;

/**
 * 
 * @author MATHEUS.BIASI
 *
 * @param <DTO>
 * @param <ID>
 */

public class IGenericServiceImpl<DTO, ID> implements IGenericService<DTO, ID> {

	
	private EAO eao;
	
	@Override
	public DTO find(ID idDto) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Response update(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response delete(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insert(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
