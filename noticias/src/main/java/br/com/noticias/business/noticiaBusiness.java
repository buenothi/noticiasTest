package br.com.noticias.business;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.noticias.dao.NoticiaPersistence;
import br.com.noticias.model.Noticia;

@Service
@Transactional
public class noticiaBusiness {

	@Autowired
	private NoticiaPersistence noticiaPersistence;

	public void salvarNoticia(Noticia noticia) {
		this.noticiaPersistence.salvar(noticia);
	}

	public void excluirNoticia(Noticia noticia) {
		this.noticiaPersistence.remover(noticia);
	}

	public void atualizarNoticia(Noticia noticia) {
		this.noticiaPersistence.atualizar(noticia);
	}

	public Noticia buscarNoticia(int id) {
		return this.noticiaPersistence.buscar(id);
	}
}
