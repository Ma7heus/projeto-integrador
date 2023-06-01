package br.com.baraabb.resource.interfaces;

import javax.ws.rs.core.Response;

import br.com.baraabb.DTO.UsuarioDTO;

public class UsuarioResource<DTO,DAO,S,E> implements IGenericResource<DTO> {

	@Override
	public Response findAll() {
		return null;
	}

	@Override
	public Response findById(Long idEntidade) {
		return null;
	}

	@Override
	public Response cadastrar(DTO entidadeDTO) {
		return null;
	}

	@Override
	public Response atualiza(Long idEntidade, DTO entidadeDTO) {
		return null;
	}

	@Override
	public Response deleta(Long idEntidade) {
		return null;
	}

	

}
