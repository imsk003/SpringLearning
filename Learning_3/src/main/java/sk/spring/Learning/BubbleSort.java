package sk.spring.Learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		return numbers;
	}
}
