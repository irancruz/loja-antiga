package br.senac.rn.loja.model;

public class Departamento implements Comparable<Departamento> {
	
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
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
			
	@Override
	public int compareTo(Departamento departamento) {
		return id.compareTo(departamento.id);
	}
	
	
}
