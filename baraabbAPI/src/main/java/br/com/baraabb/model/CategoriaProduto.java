package br.com.baraabb.model;

import java.math.BigDecimal;
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
@Table(name = "BARAABB_CATEGORIAPRODUTO")
public class CategoriaProduto extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDCATEGORIAPRODUTO", name = "SEQUENCE_IDCATEGORIAPRODUTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDCATEGORIAPRODUTO")
	private Long idCategoriaProduto;
	
	private String descricao;
	
	private BigDecimal percentualMargem;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Override
	public Long getId() {
		return idCategoriaProduto;
	}

	public Long getIdCategoriaProduto() {
		return idCategoriaProduto;
	}

	public void setIdCategoriaProduto(Long idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPercentualMargem() {
		return percentualMargem;
	}

	public void setPercentualMargem(BigDecimal percentualMargem) {
		this.percentualMargem = percentualMargem;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
