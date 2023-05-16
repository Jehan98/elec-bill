package com.example.elecbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
public class ElecBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElecBillApplication.class, args);
	}
}
