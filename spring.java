package com.example.demo;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class demoapplication {

	public static void main(String[] args) {
		SpringApplication.run(demoapplication.class, args);
		System.out.println("If you can't explain it simply, you don't understand it well enough.");
		Date d =new Date();
		System.out.println("Current Date:"+d);
	}

}