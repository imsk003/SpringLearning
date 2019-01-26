package sk.spring.Learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class LearningPropertyApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LearningPropertyApplication.class);
		ExternalService externalService = context.getBean(ExternalService.class);
		System.out.println(externalService);
        context.close();
	}

}

