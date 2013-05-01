package br.com.caelum.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarregaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Produto.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Produto produto = (Produto)session.load(Produto.class, 1L);
		
		System.out.println("nome do produto: " + produto.getNome());
		
		session.close();
	}

}
