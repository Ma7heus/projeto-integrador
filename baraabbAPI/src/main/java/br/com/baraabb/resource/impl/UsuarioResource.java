package br.com.baraabb.resource.impl;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import br.com.baraabb.DTO.UsuarioDTO;
import br.com.baraabb.resource.interfaces.IGenericResource;
import br.com.baraabb.service.UsuarioService;

/**
 * 
 * @author biasi
 *
 */

@ManagedBean
public class UsuarioResource implements IGenericResource<UsuarioDTO> {
	
	@Inject
	private UsuarioService service;

	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}

	@Override
	public List<UsuarioDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO findById(Long idEntidade) {
		return getService().find(idEntidade);
	}

	@Override
	public Response cadastrar(UsuarioDTO entidadeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response atualiza(Long idEntidade, UsuarioDTO entidadeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleta(Long idEntidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
