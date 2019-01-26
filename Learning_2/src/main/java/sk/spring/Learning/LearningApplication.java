package sk.spring.Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(LearningApplication.class, args);
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = context.getBean(BinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int res = binarySearch.binarySearch(new int[] {3,7,8}, 3);
		System.out.println(res);
		
	}

}

