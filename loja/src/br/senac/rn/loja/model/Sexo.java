package br.senac.rn.loja.model;

public class Sexo implements Comparable<Sexo> {
	
//	private static Integer contador = 0; // static so é controlado pela classe
		
	
	private Integer id;  
	private String nome;
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	@Override
	public boolean equals(Object obj) {	
		Sexo s = (Sexo) obj;
		return s.id == this.id; 
		
	  // return ((Sexo) obj).id == this.id;
	}
	
	
	@Override
	public String toString() {
		return "Sexo [id=" + id + ", nome=" + nome + ", sigla=" + sigla + "]";
	}
	@Override
	public int compareTo(Sexo o) {
/*		int id = o.id;		          // ordenar por numeros (crescente maior retorna + menor retorna - --> decrescente o inverso)
		if (this.id < id) {
			return - 1;
		}else if (this.id > id) {
			return + 1;
		}
*/		// return 0;
		return this.nome.compareTo(o.nome);  // ordenar por string
	}
	
	

}
