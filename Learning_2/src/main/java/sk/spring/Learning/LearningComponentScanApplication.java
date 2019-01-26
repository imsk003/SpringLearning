package sk.spring.Learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sk.spring.Learning")
public class LearningComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(LearningComponentScanApplication.class);

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(LearningComponentScanApplication.class, args);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		logger.info("{}",componentDAO);
	}

}

