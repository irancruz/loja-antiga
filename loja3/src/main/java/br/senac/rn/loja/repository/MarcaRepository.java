package br.senac.rn.loja.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senac.rn.loja.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer>{
	
	// List<Marca> findByNome(String nome);

	@Query("SELECT m FROM Marca m WHERE m.nome like :nome")
	List<Marca> buscaPorNome(@Param("nome") String nome);
}
