package com.jcortes.datastructures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jcortes.datastructures.edt.Main;

@SpringBootApplication
public class DatastructuresApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatastructuresApplication.class, args);

		new Main().usingCounter();
	}
}
