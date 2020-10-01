package br.com.noticias.business;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.noticias.dao.AutorPersistence;
import br.com.noticias.model.Autor;

@Service
@Transactional
public class autorBusiness {
	
	@Autowired
	private AutorPersistence autorPersistence;

	public void salvarAutor(Autor autor) {
		this.autorPersistence.salvar(autor);
	}

	public void excluirAutor(Autor autor) {
		this.autorPersistence.remover(autor);
	}

	public void atualizarAutor(Autor autor) {
		this.autorPersistence.atualizar(autor);
	}
	
	public Autor buscarAutor(int id) {
		return this.autorPersistence.buscar(id);
	}
}
