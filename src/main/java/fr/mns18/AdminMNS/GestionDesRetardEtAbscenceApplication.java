package fr.mns18.AdminMNS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GestionDesRetardEtAbscenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesRetardEtAbscenceApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello world";
	}
}
