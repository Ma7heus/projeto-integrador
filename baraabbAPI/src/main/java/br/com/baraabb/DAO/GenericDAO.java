package br.com.baraabb.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author biasi
 *
 */

public abstract class GenericDAO<T, ID> {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Class<T> clazz;
	
	public GenericDAO(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public void cadastrar(T entidade) {
		entityManager.persist(entidade);
	}
	
	public void deletar(ID idEntidade) {
		T entidade = entityManager.find(clazz, idEntidade);
		entityManager.remove(entidade);
	}
	
	public List<T> selectAll() {
		List<T> listaEntidade = entityManager.createQuery("SELECT clazz FROM " + clazz.getSimpleName() + " clazz", clazz).getResultList();
		return listaEntidade;
	}
		
	public void atualizar(T entidade) {
		entityManager.merge(entidade);
	}
	
	public T buscaById(ID idEntidade) {
		return entityManager.find(clazz, idEntidade);
	}

}
