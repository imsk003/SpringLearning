package sk.spring.Learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LearningApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LearningApplication.class);
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = context.getBean(BinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int res = binarySearch.binarySearch(new int[] {3,7,8}, 3);
		System.out.println(res);
        context.close();
	}

}

