package sk.spring.Learning;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JdbcConnection");
    }
}
