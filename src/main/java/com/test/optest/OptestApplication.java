package com.test.optest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class OptestApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OptestApplication.class, args);
		String cmd ="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://localhost:8081";
		Runtime runtime = Runtime.getRuntime();
		runtime.exec(cmd);
	}

}
