package br.com.noticias.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.noticias.model.Autor;

@Repository
public class AutorPersistence {

	@PersistenceContext
	private EntityManager em;

	public void salvar(Autor autor) {
		this.em.persist(autor);
	}

	public Autor buscar(int id) {
		return this.em.find(Autor.class, id);
	}

	public void remover(Autor autor) {
		this.em.remove(autor);
	}

	public void atualizar(Autor autor) {
		this.em.merge(autor);
	}

}
