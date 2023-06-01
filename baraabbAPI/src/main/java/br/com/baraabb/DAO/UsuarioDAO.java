package br.com.baraabb.DAO;

import javax.ejb.Stateless;

import br.com.baraabb.model.Usuario;

@Stateless
public class UsuarioDAO extends GenericDAO<Usuario, Long> {

	public UsuarioDAO() {
		super(Usuario.class);
	}

}
