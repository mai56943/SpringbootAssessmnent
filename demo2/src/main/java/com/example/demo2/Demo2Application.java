package com.example.demo2;

import java.util.Arrays;

import com.example.demo2.Calculate;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		// SpringApplication.run(Demo2Application.class, args);

		Calculate.testCalculateMedianExample1();
		Calculate.testCalculateMedianExample2();
	}

}
