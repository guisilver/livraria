package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	@PersistenceContext
	private EntityManager manager;

	@PostConstruct
	void aposCriacao() {
		System.out.println("AutorDao foi criado!");
	}

	public void salva(Autor autor) {
		this.manager.persist(autor);
	}

	public List<Autor> todosAutores() {
		return this.manager.createQuery("select a from Autor a order by a.nome", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		return this.manager.find(Autor.class, autorId);
	}

}
