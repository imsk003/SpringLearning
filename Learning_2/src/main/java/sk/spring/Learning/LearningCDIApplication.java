package sk.spring.Learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningCDIApplication {

	private static Logger logger = LoggerFactory.getLogger(LearningCDIApplication.class);

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(LearningCDIApplication.class, args);
		CDIBusiness cdiBusiness = context.getBean(CDIBusiness.class);

		logger.info("{}",cdiBusiness);
	}

}

