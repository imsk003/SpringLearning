package sk.learning.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {
	
	public String retrieveData() {
		return "DAO1";
	}
}
