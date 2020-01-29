package com.rahul.dummy5;

import com.rahul.dummy5.entity.Student;
import com.rahul.dummy5.repository.MyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dummy5Application implements CommandLineRunner {
	@Autowired
	MyRespository myRespository;

	public static void main(String[] args) {
		SpringApplication.run(Dummy5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("Rahul Gogyani", "bbbbb");
		myRespository.save(s1);
		System.out.println(myRespository.getByName("Rahul Gogyani"));
	}
}
