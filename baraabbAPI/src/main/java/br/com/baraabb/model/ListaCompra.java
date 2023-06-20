package br.com.baraabb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author biasi
 *
 */

@Entity
@Table(name = "BARAABB_LIATACOMPRAS")
public class ListaCompra extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDLISTACOMPRA", name = "SEQUENCE_IDLISTACOMPRA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDLISTACOMPRA")
	private Long idListaCompra;
	
	@JoinColumn(name = "IDUSUARIO", foreignKey = @ForeignKey(name="FK_LISTACOMPRA_USUARIO"))
	private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "LISTACOMPRAS")
	private Set<ListaCompraProduto> produtosSet = new HashSet<>();

	@Override
	public Long getId() {
		return idListaCompra;
	}

	public Long getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(Long idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<ListaCompraProduto> getProdutosSet() {
		return produtosSet;
	}

	public void setProdutosSet(Set<ListaCompraProduto> produtosSet) {
		this.produtosSet = produtosSet;
	}
	
}
