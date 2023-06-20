package br.com.baraabb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author biasi
 *
 */

@Entity
@Table(name = "BARAABB_CLIENTE")
public class Cliente extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDCLIENTE", name = "SEQUENCE_IDCLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDCLIENTE")
	private Long idCliente;
	
	private String nome;
	
	private String telefone;
	
	private String email;
	
	private String observacoes;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datacadastro;

	@Override
	public Long getId() {
		return idCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	
}
