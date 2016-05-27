package springfacil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// MVC JSP Template
		System.getProperties().setProperty("spring.mvc.view.prefix", "/WEB-INF/jsp/");
		System.getProperties().setProperty("spring.mvc.view.suffix", ".jsp");
		
		SpringApplication.run(Application.class, args);
	}
	
}
