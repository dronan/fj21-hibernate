package br.com.caelum.hibernate;

import org.hibernate.Session;

import br.com.caelum.hibernate.dao.ProdutoDAO;

public class TestaBuscas {
	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		ProdutoDAO dao = new ProdutoDAO(session);
		System.out.println("********Listando tudo*********");

		for (Produto p : dao.listaTudo()) {
			System.out.println(p.getNome());
		}

		System.out.println("********Paginacao*********");

		for (Produto p : dao.pagina(1,3)) {
			System.out.println(p.getNome());
		}

		System.out.println("********Precos maiores que*********");

		for (Produto p : dao.precoMaiorQue(30.0)) {
			System.out.println(p.getNome());
		}

	}
}
