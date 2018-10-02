package br.senac.rn.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senac.rn.loja.repository.MarcaRepository;

@SpringBootApplication
public class Loja3Application implements CommandLineRunner{
	
	@Autowired
	private MarcaRepository repository;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Loja3Application.class);
		app.run(args);				
	}
		
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repository.buscaPorNome("n%"));
		
	}
	
}
