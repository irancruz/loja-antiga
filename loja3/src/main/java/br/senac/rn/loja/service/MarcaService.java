package br.senac.rn.loja.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.senac.rn.loja.model.Marca;
import br.senac.rn.loja.repository.MarcaRepository;

@Service
@Transactional
// feito para regra de negocios como travamento de nome ou validação
public class MarcaService {
	
	@Autowired
	private MarcaRepository repository;
	
	public void salvar(Marca marca) {
		repository.save(marca);
	}
	
	public List<Marca> buscar() {
		return repository.findAll();
	}

}
