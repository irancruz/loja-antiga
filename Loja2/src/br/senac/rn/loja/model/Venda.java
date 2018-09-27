package br.senac.rn.loja.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.senac.rn.loja.dao.GenericDAO;

@Table
@Entity
public class Venda extends GenericDAO<Venda> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer nota_fiscal;
	@ManyToOne // chave estrageira um para varios
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	@Temporal(TemporalType.DATE)
	private Calendar data_venda;
	private Float total_venda;
	@ManyToMany //Chave estrageira varios para varios
	@JoinTable(name="itens_venda", joinColumns=@JoinColumn(name="id_venda"), inverseJoinColumns=@JoinColumn(name="id_produto"))	//tabela de Vendas_itens
	private List<Produto> produtos;
	
	public Venda() {
		this.cliente = new Cliente();
		this.produtos = new ArrayList<Produto>();
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(Integer nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getData_venda() {
		return data_venda;
	}
	public void setData_venda(Calendar data_venda) {
		this.data_venda = data_venda;
	}
	public Float getTotal_venda() {
		Float total = 0.0f;
		for (Produto produto : produtos) {
			total += produto.getValor();
		}
		return total;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public void setTotal_venda(Float total_venda) {
		this.total_venda = total_venda;
	}
	
	@Override
	public Class<Venda> getClassType() {		
		return Venda.class;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", nota_fiscal=" + nota_fiscal + ", cliente=" + cliente + ", data_venda="
				+ data_venda + ", total_venda=" + total_venda + "]";
	}	
	
}
