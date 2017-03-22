package br.com.caelum.livraria.webservices;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
@WebService
public class LivrariaWS {

	public List<Livro> gerLivrosPeloNome(String nome) {

		System.out.println("LivrariaWS: procurando pelo nome " + nome);

		return null;
	}

}
