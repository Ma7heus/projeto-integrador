package br.com.baraabb.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.baraabb.DTO.UsuarioDTO;
import br.com.baraabb.model.Usuario;

public abstract class ConversorUsuario {
	
	public static UsuarioDTO entityToDTO(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setIdUsuario(usuario.getId());
		dto.setEmail(usuario.getEmail());
		dto.setLogin(usuario.getLogin());
		dto.setSenha(usuario.getSenha());
		return dto;
	}
	
	public static Usuario dtoToEntity(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(dto.getId());
		usuario.setEmail(dto.getEmail());
		usuario.setLogin(dto.getLogin());
		usuario.setSenha(dto.getSenha());
		return usuario;
	}
	
	public static List<UsuarioDTO> entityToDTOList(List<Usuario> listUsuario){
		List<UsuarioDTO> listDto = new ArrayList<>();
		for (Usuario usuario : listUsuario) {
			listDto.add(entityToDTO(usuario));
		}
		return listDto;
	}
	
}
