package sk.learning.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
	
	@Autowired
	private DAO1 dao1;
	
	public String calculate( ) {
		return dao1.retrieveData();
	}
}
