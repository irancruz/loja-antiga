package br.senac.rn.loja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Table(tb_departamentos) ou
@Table
@Entity

public class Departamento implements Comparable<Departamento> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;  
	private String nome;
	private Float desconto;
	private String sigla;
	private String fone;
	
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
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
