package fr.istic.tpjpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		

		// create entity Person : Jean-Kevin
		Person jeanKevin = new Person();
		jeanKevin.setLastName("lolilol");
		jeanKevin.setFirstName("JeanKevin");
		jeanKevin.setAge(14);
		jeanKevin.setNickname("JanKev");
		jeanKevin.setHobbies("Loliloleur");
		jeanKevin.setJob("Dresseur pokemon lvl 55");

		// create entity Person : SuperHouse
		Home superHouse = new Home();
		superHouse.setAddress("13 LALALA STREET");
		superHouse.setCityArea("Fratton");
		superHouse.setCityTown("PORSMOUTH");
		superHouse.setCounty("Hampshire");
		superHouse.setCountry("UK");
		superHouse.setResident(jeanKevin);
		
		// create entity Person : BadHouse
		Home badHouse = new Home();
		superHouse.setResident(jeanKevin);
		
		//persist entities
		
		test.manager.persist(jeanKevin);
		test.manager.persist(superHouse);
		test.manager.persist(badHouse);
		

		tx.commit();

		// TODO run request

		System.out.println(".. Jean-Kevin spotted !");
	}

}
