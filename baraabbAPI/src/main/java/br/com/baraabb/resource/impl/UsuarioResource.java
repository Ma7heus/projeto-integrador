package br.com.baraabb.resource.impl;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
		return getService().findAll();
	}

	@Override
	public UsuarioDTO findById(Long idEntidade) {
		return getService().find(idEntidade);
	}

	@Override
	public Response cadastrar(UsuarioDTO dto) {
		getService().insert(dto);;
		return Response.ok(Status.CREATED).build();
	}

	@Override
	public Response atualiza(Long idEntidade, UsuarioDTO dto) {
		getService().update(dto);
		return Response.ok(Status.ACCEPTED).build();
	}

	@Override
	public Response deleta(Long idEntidade) {
		getService().delete(idEntidade);
		return Response.ok(Status.NO_CONTENT).build();
	}

}
