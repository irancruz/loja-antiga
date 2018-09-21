package br.senac.rn.loja.model;

public class Produto {

	private Integer id;  
	private String nome;
	private String descricao;
	private Float preco;
	private Integer quantidade_minima;  
	private Integer quantidade_estoque;
//	private Integer marca_id;	
	private Departamento departamento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Integer getQuantidade_minima() {
		return quantidade_minima;
	}
	public void setQuantidade_minima(Integer quantidade_minima) {
		this.quantidade_minima = quantidade_minima;
	}
	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}
	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}	
	public Departamento getDepartamento() {
		return departamento;
	}	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", quantidade_minima=" + quantidade_minima + ", quantidade_estoque=" + quantidade_estoque
				+ ", marca_id=" + getDepartamento() + "]";
	}	
	
	
	
	
	
	
}
