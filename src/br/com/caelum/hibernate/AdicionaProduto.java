package br.com.caelum.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdicionaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto();
		p.setNome("Diego");
		p.setDescricao("Descricao do produto");
		p.setPreco(10.40);
		
		//Configuration cfg = new Configuration().addAnnotatedClass(Produto.class);

		
		//@SuppressWarnings("deprecation")
		//SessionFactory factory = cfg.buildSessionFactory();
		//Session session = factory.openSession();
		
		Session session = new HibernateUtil().getSession();
		
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
		System.out.println("Id gerado: " +p.getId());
		
		session.close();
		
	}

}
