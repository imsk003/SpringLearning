package sk.learning.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	
	@Autowired
	private DAO2 dao2;
	
	public String calculate( ) {
		return dao2.retrieveData();
	}
}
