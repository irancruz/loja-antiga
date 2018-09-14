package br.senac.rn.loja.teste;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.senac.rn.loja.model.Sexo;

public class TestaSetHash {

	public static void main(String[] args) {
		
		Set <Sexo> sexos = new HashSet<Sexo>();
		
		int resposta = 1;
		int id = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			Sexo sexo = new Sexo();
			sexo.setId(id);
			System.out.println("Informe o nome do Sexo:");
			sexo.setNome(entrada.next());
			System.out.println("Informe a sigla do Sexo:");
			sexo.setSigla(entrada.next());
			sexos.add(sexo);
			System.out.println("Digite 0(ZERO) para SAIR");
			resposta = entrada.nextInt();
			id++;
		} while(resposta != 0);
		
		entrada.close();

		
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
//		s3.setNome("N�o Informado");
//		s3.setSigla("N");		
//		
//		Sexo s4 = new Sexo();
//		s4.setId(2);
//		s4.setNome("N�o Informado");
//		s4.setSigla("N");
//		
//		sexos.add(s4);
//		sexos.add(s3);
//		sexos.add(s2);
//		sexos.add(s1);
//		sexos.remove(s2);
		
		sexos.forEach(sexo -> System.out.println(sexo)); // mesma coisa do for
		
		for (Sexo sexo : sexos) {
			if (sexo.getId() == 2) {
				System.out.println(sexo);
				System.out.println("Achou");
				break;
			}
		}
		
		System.out.println(sexos.size());
		System.out.println(sexos);
//		System.out.println(sexos.get(2));
//		System.out.println(sexos.contains(s4));			

	}

}
