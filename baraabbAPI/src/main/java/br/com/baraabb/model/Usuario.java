package br.com.baraabb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author biasi
 *
 */

@Entity
@Table(name = "BARAABB_USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUsuario;
	
	private String senha;
	
	private String email;
	
	private String login;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
}
