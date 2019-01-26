package sk.learning.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	
	@Autowired
	PersonJpaDAO personJpaDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("All users -> "+personJpaDAO.findAll());
//		System.out.println("Find By Id -> "+personJpaDAO.findById(1001));
//		personJpaDAO.deleteById(1002);
//		System.out.println("Insert -> "+personJpaDAO.insert(new Person(1003, "PK","Chennai",new Date())));
//		System.out.println("Update -> "+personJpaDAO.update(new Person(1002, "AK","Trichy",new Date())));
	}

}

