package br.com.baraabb.utils;

import br.com.baraabb.DTO.UsuarioDTO;
import br.com.baraabb.model.Usuario;

public class ConversorUsuario {
	
	public UsuarioDTO entityToDTO(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setIdUsuario(usuario.getId());
		dto.setEmail(usuario.getEmail());
		dto.setLogin(usuario.getLogin());
		dto.setSenha(usuario.getSenha());
		return dto;
	}

}
