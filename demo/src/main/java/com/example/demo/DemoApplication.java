package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
	private JdbcTemplate j;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	String sql="INSERT INTO STUDENT (id,name,department) values (?,?,?)";
	int r=j.update(sql,2,"g","s");
if(r>0)
System.out.print("success value is"+r);
	}


}
