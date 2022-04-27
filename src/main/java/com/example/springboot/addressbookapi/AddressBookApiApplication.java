package com.example.springboot.addressbookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AddressBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookApiApplication.class, args);
	}

}
