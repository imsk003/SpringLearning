//package sk.learning.database;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringJdbcApplication implements CommandLineRunner {
//	
//	@Autowired
//	PersonJdbcDAO personJdbcDAO;
//	
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("All users -> "+personJdbcDAO.findAll());
////		System.out.println("Find By Id -> "+personJdbcDAO.findById(1001));
////		System.out.println("Delete By Id -> "+personJdbcDAO.deleteById(1002));
////		System.out.println("Insert -> "+personJdbcDAO.insert(new Person(1003, "PK","Chennai",new Date())));
////		System.out.println("Update -> "+personJdbcDAO.update(new Person(1002, "AK","Trichy",new Date())));
//	}
//
//}
//
