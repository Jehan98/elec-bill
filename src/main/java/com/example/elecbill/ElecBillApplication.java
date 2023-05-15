package com.example.elecbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ElecBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElecBillApplication.class, args);
	}

	@GetMapping("/")
	@CrossOrigin(origins = "http://localhost:4200")
	public String hello(){
		return "Hello World";
	}

}
