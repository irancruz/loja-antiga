package br.senac.rn.loja.teste;

import java.util.Scanner;

import br.senac.rn.loja.dao.DepartamentoDAO;
import br.senac.rn.loja.dao.SexoDAO;
import br.senac.rn.loja.model.Departamento;
import br.senac.rn.loja.model.Sexo;

public class TestaArrayList {

	public static void main(String[] args) {
	
					
		Scanner entrada = new Scanner(System.in);
		
		int resposta; 
		
		 /*
		 SexoDAO dao = new SexoDAO();
		
		do {
			Sexo sexo = new Sexo();
			System.out.println("Informe o nome do Sexo:");
			sexo.setNome(entrada.next());
			System.out.println("Informe a sigla do Sexo:");
			sexo.setSigla(entrada.next());
			dao.inserir(sexo);
			System.out.println("Digite 0(ZERO) para SAIR");
			resposta = entrada.nextInt();			
		} while(resposta != 0);
		
		Sexo sm = new Sexo();
		sm.setId(1);
		sm.setNome("teste");
		dao.editar(sm); */
		
		
		DepartamentoDAO dao = new DepartamentoDAO();
		
		do {
			Departamento departamento = new Departamento();
			System.out.println("Informe o nome do Departamento:");
			departamento.setNome(entrada.next());
			System.out.println("Informe o Desconto:");
			departamento.setSigla(entrada.next());
			System.out.println("Informe a sigla do Departamento:");
			departamento.setSigla(entrada.next());
			dao.inserir(departamento);
			System.out.println("Digite 0(ZERO) para SAIR");
			resposta = entrada.nextInt();			
		} while(resposta != 0);
		
		Departamento sm = new Departamento();
		sm.setId(1);
		sm.setNome("teste");
		dao.editar(sm); 
		
		entrada.close();
		
		dao.buscarTodos().forEach(sexo -> System.out.println(sexo)); // forEach mesma coisa do for	
		
		
//		Sexo s1 = new Sexo();
//		s1.setId(1);
//		s1.setNome("Masculino");
//		s1.setSigla("M");		
//		
//		Sexo s2 = new Sexo();
//		s2.setId(2);
//		s2.setNome("Feminino");
//		s2.setSigla("F");		
//				
//		Sexo s3 = new Sexo();
//		s3.setId(2);
//		s3.setNome("Não Informado");
//		s3.setSigla("N");		
//		
//		Sexo s4 = new Sexo();
//		s4.setId(2);
//		s4.setNome("Não Informado");
//		s4.setSigla("N");
//		
//		sexos.add(s4);
//		sexos.add(s3);
//		sexos.add(s2);
//		sexos.add(s1);
//		sexos.remove(s2);
		
//		sexos.forEach(sexo -> System.out.println(sexo)); // mesma coisa do for
		
//		for (Sexo sexo : sexos) {
//			if (sexo.getId() == 2) {
//				System.out.println(sexo);
//				System.out.println("Achou");
//				break;
//			}
//		}
//		
//		System.out.println(sexos.size());
//		System.out.println(sexos);
//		System.out.println(sexos.get(2));
//		System.out.println(sexos.contains(s4));			

	}

}
