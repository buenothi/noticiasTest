package br.com.noticias.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.noticias.model.Noticia;

@Repository
public class NoticiaPersistence {

	@PersistenceContext
	private EntityManager em;

	public void salvar(Noticia noticia) {
		this.em.persist(noticia);
	}

	public Noticia buscar(int id) {
		return this.em.find(Noticia.class, id);
	}

	public void remover(Noticia noticia) {
		this.em.remove(noticia);
	}

	public void atualizar(Noticia noticia) {
		this.em.merge(noticia);
	}

}
