package br.com.baraabb.resource.interfaces;

import java.util.List;

import javax.ws.rs.core.Response;

import br.com.baraabb.DAO.GenericDAO;
import br.com.baraabb.DTO.AbstractDTO;

public class GenericResource<DTO extends AbstractDTO,VO,DAO extends GenericDAO<E, Long> ,S,E> implements IGenericResource<DTO> {

	private Class<DTO> dto;
	
	private Class<E> entity;
	
	private Class<DAO> dao;
	
	private Class<VO> vo;
	
	private Class<S> service;
	
	
	public GenericResource(Class<DTO> dto, Class<E> entity, Class<DAO> dao, Class<VO> vo, Class<S> service) {
		this.dto = dto;
		this.entity = entity;
		this.dao = dao;
		this.vo = vo;
		this.service = service;
	}

	@Override
	public List<DTO> findAll() {
		return null;
	}

	@Override
	public DTO findById(Long idEntidade) {
		return null;
	}

	@Override
	public Response cadastrar(DTO entidadeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response atualiza(Long idEntidade, DTO entidadeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleta(Long idEntidade) {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<DTO> getDto() {
		return dto;
	}

	public void setDto(Class<DTO> dto) {
		this.dto = dto;
	}

	public Class<E> getEntity() {
		return entity;
	}

	public void setEntity(Class<E> entity) {
		this.entity = entity;
	}

	public Class<DAO> getDao() {
		return dao;
	}

	public void setDao(Class<DAO> dao) {
		this.dao = dao;
	}

	public Class<VO> getVo() {
		return vo;
	}

	public void setVo(Class<VO> vo) {
		this.vo = vo;
	}

	public Class<S> getService() {
		return service;
	}

	public void setService(Class<S> service) {
		this.service = service;
	}

}
