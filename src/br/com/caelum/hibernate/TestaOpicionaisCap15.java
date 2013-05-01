package br.com.caelum.hibernate;

import org.hibernate.Session;

public class TestaOpicionaisCap15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session= new HibernateUtil().getSession();
		Produto encontrado = (Produto) session.load(Produto.class, 1L);
		System.out.println("o select ja foi feito");
		System.out.println(encontrado.getNome());
		System.out.println(encontrado.getClass().getName());
	}

}
