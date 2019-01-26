package sk.spring.Learning;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {
    public ComponentJdbcConnection() {
        System.out.println("JdbcConnection");
    }
}
