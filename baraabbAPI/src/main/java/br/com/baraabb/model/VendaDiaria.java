package br.com.baraabb.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "BARAABB_VENDADIARIA")
public class VendaDiaria extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDVENDADIARIA", name = "SEQUENCE_IDVENDADIARIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDVENDADIARIA")
	private Long idVendaDiaria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUSUARIO", foreignKey = @ForeignKey(name ="FK_VENDADIARIA_USUARIO"))
	private Usuario usuario;
	
	private BigDecimal valorTotalBruto;
	
	private BigDecimal valorTotalLiquido;
		
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "VENDADIARIA")
	private Set<VendaDiariaProduto> vendaDiariaProdutoSet = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "VENDADIARIA")
	private Set<VendaDiariaFormaRecebimento> vendaDiariaFormaRecebimentoSet = new HashSet<>();
	
	@Override
	public Long getId() {
		return idVendaDiaria;
	}

	public Long getIdVendaDiaria() {
		return idVendaDiaria;
	}

	public void setIdVendaDiaria(Long idVendaDiaria) {
		this.idVendaDiaria = idVendaDiaria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValorTotalBruto() {
		return valorTotalBruto;
	}

	public void setValorTotalBruto(BigDecimal valorTotalBruto) {
		this.valorTotalBruto = valorTotalBruto;
	}

	public BigDecimal getValorTotalLiquido() {
		return valorTotalLiquido;
	}

	public void setValorTotalLiquido(BigDecimal valorTotalLiquido) {
		this.valorTotalLiquido = valorTotalLiquido;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Set<VendaDiariaProduto> getVendaDiariaProdutoSet() {
		return vendaDiariaProdutoSet;
	}

	public void setVendaDiariaProdutoSet(Set<VendaDiariaProduto> vendaDiariaProdutoSet) {
		this.vendaDiariaProdutoSet = vendaDiariaProdutoSet;
	}

	public Set<VendaDiariaFormaRecebimento> getVendaDiariaFormaRecebimentoSet() {
		return vendaDiariaFormaRecebimentoSet;
	}

	public void setVendaDiariaFormaRecebimentoSet(Set<VendaDiariaFormaRecebimento> vendaDiariaFormaRecebimentoSet) {
		this.vendaDiariaFormaRecebimentoSet = vendaDiariaFormaRecebimentoSet;
	}

}
