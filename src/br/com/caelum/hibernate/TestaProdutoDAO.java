package br.com.caelum.hibernate;

import org.hibernate.Session;

import br.com.caelum.hibernate.dao.ProdutoDAO;

public class TestaProdutoDAO {
	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		ProdutoDAO dao = new ProdutoDAO(session);
		Produto produto = new Produto();
		
		//produto.setNome("test");
		//produto.setDescricao("update");
		//produto.setPreco(50);
		//produto.setId((long) 3);
		
		session.beginTransaction();
		dao.procura((long)4);
		session.getTransaction().commit();
		session.close();
		
	}
}
