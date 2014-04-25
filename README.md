# TP - JPA


Cette application utilise JPA et Maven et permet de manipuler 4 classes métiers selon l'architecture suivante :

 ![Texte alternatif](http://davidmichel.fr/images/tpjpa.png)

Les objets issus de ces classes sont persistés dans une base de données grâce à la classe JpaTest qui manipule un objet EntityManager. 

```java
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
  
  // create entity Home : SuperHouse
  Home superHouse = new Home();
  superHouse.setAddress("13 LALALA STREET");
  superHouse.setCityArea("Fratton");
  superHouse.setCityTown("PORSMOUTH");
  superHouse.setCounty("Hampshire");
  superHouse.setCountry("UK");
  superHouse.setResident(jeanKevin);
  
  // create entity Home : BadHouse
  Home badHouse = new Home();
  superHouse.setResident(jeanKevin);
  
  //persist entities
  test.manager.persist(jeanKevin);
  test.manager.persist(superHouse);
  test.manager.persist(badHouse);
  
  tx.commit();

```