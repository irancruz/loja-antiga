package br.senac.rn.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//public class Loja3Application implements CommandLineRunner{
public class Loja3Application {
	public static void main(String[] args) {
		SpringApplication.run(Loja3Application.class);
	}
	
	
	//versão para teste no console
/*	@Autowired
	private MarcaRepository repository;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Loja3Application.class);
		app.run(args);				
	}*/
		
/*	@Override
	public void run(String... args) throws Exception {
		System.out.println(repository.buscaPorNome("n%"));
		
	}
	*/
}
