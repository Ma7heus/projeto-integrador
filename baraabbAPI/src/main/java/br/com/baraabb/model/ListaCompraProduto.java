package br.com.baraabb.model;

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
@Table(name = "BARAABB_LISTACOMPRAPRODUTO")
public class ListaCompraProduto extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, sequenceName = "IDLISTACOMPRAPRODUTO", name = "SEQUENCE_IDLISTACOMPRAPRODUTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQUENCE_IDLISTACOMPRAPRODUTO")
	private Long idListaCompraProduto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPRODUTO", foreignKey = @ForeignKey(name="FK_LISTACOMPRAPRODUTO_PRODUTO"))
	private Produto produto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDLISTACOMPRA", foreignKey = @ForeignKey(name="FK_LISTACOMPRAPRODUTO_LISTCOMPRA"))
	private ListaCompra listaCompra;

	@Override
	public Long getId() {
		return idListaCompraProduto;
	}

	public Long getIdListaCompraProduto() {
		return idListaCompraProduto;
	}

	public void setIdListaCompraProduto(Long idListaCompraProduto) {
		this.idListaCompraProduto = idListaCompraProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ListaCompra getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}

}
