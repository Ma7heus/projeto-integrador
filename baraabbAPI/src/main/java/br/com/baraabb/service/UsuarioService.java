package br.com.baraabb.service;

import java.util.List;

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

	@Override
	public UsuarioDTO find(Long id) {
		return ConversorUsuario.entityToDTO(getEao().buscaById(id));
	}
	
	@Override
	public List<UsuarioDTO> findAll() {
		return ConversorUsuario.entityToDTOList(getEao().selectAll());
	}

	@Override
	public void update(UsuarioDTO dto) {
		getEao().atualizar(ConversorUsuario.dtoToEntity(dto));
	}

	@Override
	public void delete(Long id) {
		getEao().deletar(id);
	}

	@Override
	public void insert(UsuarioDTO dto) {
		getEao().cadastrar(ConversorUsuario.dtoToEntity(dto));
	}

	public UsuarioDAO getEao() {
		return eao;
	}

	public void setEao(UsuarioDAO eao) {
		this.eao = eao;
	}

}
