package sk.spring.Learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(LearningScopeApplication.class);

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(LearningScopeApplication.class, args);
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		logger.info("{}",personDAO1);
		logger.info("{}",personDAO1.getJdbcConnection());
	}

}

