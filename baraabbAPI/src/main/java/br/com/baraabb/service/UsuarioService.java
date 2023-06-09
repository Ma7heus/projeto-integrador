package br.com.baraabb.service;

import javax.inject.Inject;

import br.com.baraabb.DAO.UsuarioDAO;
import br.com.baraabb.DTO.UsuarioDTO;
import br.com.baraabb.model.Usuario;
import br.com.baraabb.utils.ConversorUsuario;

/**
 * 
 * @author biasi
 *
 */

public class UsuarioService extends GenericService<UsuarioDTO, Usuario, Long> {

	@Inject
	private UsuarioDAO eao;
	
	@Inject
	private ConversorUsuario conversor;

	@Override
	public UsuarioDTO find(Long id) {
		return conversor.entityToDTO(getEao().buscaById(id));
	}

	@Override
	public void update(UsuarioDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(UsuarioDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario conversor(UsuarioDTO dto) {
		return null;
	}

	@Override
	public void validador(Usuario entity) {
	}

	public UsuarioDAO getEao() {
		return eao;
	}

	public void setEao(UsuarioDAO eao) {
		this.eao = eao;
	}
	

}
