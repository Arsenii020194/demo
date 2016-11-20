package com.example;

import com.example.generator.RequestGenerator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Main-Class.
 */
@SpringBootApplication
public class DemoApplication {

	public static FileOutputStream out;

	/**
	 * Main-Method.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		try {
			out = new FileOutputStream(new File("src\\main\\java\\com\\example\\generator\\out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		SpringApplication.run(DemoApplication.class, args);
		try {
			new RequestGenerator(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
