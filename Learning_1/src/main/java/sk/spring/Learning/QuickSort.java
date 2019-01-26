package sk.spring.Learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSort implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		return numbers;
	}
}
