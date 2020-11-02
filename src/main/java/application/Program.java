package application;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.Automovel;
import aulajpa.Marca;
import aulajpa.Modelo;

public class Program {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
			
		
			Marca m1 = new Marca(null, "Chevrolet");
			Modelo md2 = new Modelo(null, "seila", 520);
			Automovel a3 = new Automovel(null, 2020, "n/d", Float.valueOf(55000), 100);
			
			em.persist(m1);
			em.persist(md2);
			em.persist(a3);
		
		
		em.getTransaction().commit();
	
		
		em.close();
		emf.close();
	}
}
