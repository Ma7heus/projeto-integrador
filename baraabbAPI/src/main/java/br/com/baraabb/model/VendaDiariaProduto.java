package br.com.baraabb.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author biasi
 *
 */

@Entity
@Table(name = "BARAABB_VENDADIARIAPRODUTO")
public class VendaDiariaProduto extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDVENDADIARIAPRODUTO", name = "SEQUENCE_IDVENDADIARIAPRODUTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDVENDADIARIAPRODUTO")
	private Long idVendaDiariaProduto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPRODUTO", foreignKey = @ForeignKey(name = "FK_VENDDIAPRODUTO_PRODUTO"))
	private Produto produto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDVENDADIARIA", foreignKey = @ForeignKey(name = "FK_VENDDIAPRODUTO_VENDADIARIA"))
	private VendaDiaria vendaDiaria;
	
	private BigDecimal valorTotalVendido;
	
	private Long quantidadeTotalVendida;

	@Override
	public Long getId() {
		return idVendaDiariaProduto;
	}

	public Long getIdVendaDiariaProduto() {
		return idVendaDiariaProduto;
	}

	public void setIdVendaDiariaProduto(Long idVendaDiariaProduto) {
		this.idVendaDiariaProduto = idVendaDiariaProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getValorTotalVendido() {
		return valorTotalVendido;
	}

	public void setValorTotalVendido(BigDecimal valorTotalVendido) {
		this.valorTotalVendido = valorTotalVendido;
	}

	public Long getQuantidadeTotalVendida() {
		return quantidadeTotalVendida;
	}

	public void setQuantidadeTotalVendida(Long quantidadeTotalVendida) {
		this.quantidadeTotalVendida = quantidadeTotalVendida;
	}
	
}
