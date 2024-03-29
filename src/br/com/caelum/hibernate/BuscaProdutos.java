package br.com.caelum.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BuscaProdutos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration()
				.addAnnotatedClass(Produto.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Query query = session
				.createQuery("select p from Produto as p where p.preco > :paramPreco");

		query.setParameter("paramPreco", 10.0);

		List<Produto> lista = query.list();
		for (Produto p : lista) {
			System.out.println(p.getNome());
		}
		session.close();

	}

}
