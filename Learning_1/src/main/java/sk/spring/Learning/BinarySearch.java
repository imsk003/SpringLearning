package sk.spring.Learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.print(sortAlgorithm);
		
		return 3;
	}
}
