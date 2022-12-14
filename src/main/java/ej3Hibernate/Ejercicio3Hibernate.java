package ej3Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ejercicio3Hibernate {

	public static void main(String[] args) {
		
		
		EntityManager em = managerFactory.createEntityManager();
		
		Employee emp = new Employee();
		emp.setId(6666L);
		emp.setName("Nerea");
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(emp);
		tran.commit();
		em.close();


}
	
	private static EntityManagerFactory managerFactory = Persistence
			.createEntityManagerFactory("ejsHibernate");

	
}
