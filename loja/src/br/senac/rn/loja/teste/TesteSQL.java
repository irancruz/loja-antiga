package br.senac.rn.loja.teste;

import br.senac.rn.loja.dao.SexoDAO;
import br.senac.rn.loja.model.Sexo;

public class TesteSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sexo s = new Sexo();
		s.setNome("teste");
		s.setSigla("t");
		
		SexoDAO dao = new SexoDAO();
		dao.inserir(s);
	}

}
