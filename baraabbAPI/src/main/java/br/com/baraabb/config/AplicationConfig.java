package br.com.baraabb.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.baraabb.resource.impl.UsuarioResource;

/**
 * 
 * @author biasi
 * Adicionar resources seguindo mesmo padrão.
 */


@ApplicationPath("api/v1")
public class AplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(UsuarioResource.class);
		return resources;
	}
} 