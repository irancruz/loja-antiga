package br.senac.rn.loja.model;

public class Departamento {
	
	private static Integer contador = 0;
	
	public Departamento() {
		Departamento.contador ++;
		id = Departamento.contador;
	}	
			
	private Integer id;  
	private String nome;
	private Float desconto;
	private String sigla;	
	
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
	public Float getDesconto() {
		return desconto;
	}
	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}	
	
	@Override
	public boolean equals(Object obj) {	
		Departamento s = (Departamento) obj;
		return s.id == this.id; 
		
	  // return ((Sexo) obj).id == this.id;
	}
	
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", desconto=" + desconto + ", sigla=" + sigla + "]";
	}
	
}
