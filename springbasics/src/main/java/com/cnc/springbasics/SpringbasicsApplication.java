package com.cnc.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cnc.springbasics.classes.Laptop;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
	 	ConfigurableApplicationContext context =	SpringApplication.run(SpringbasicsApplication.class, args);

		Laptop appleA8 = context.getBean(Laptop.class);
		appleA8.setBrandName("Macinthosh");
		appleA8.setLength(200);
		appleA8.setWidth(20);
		appleA8.bootLaptop();
		// System.out.println(appleA8.toString());

		Laptop lenovo = context.getBean(Laptop.class);
		lenovo.setBrandName("Lenovo l20");
		lenovo.setLength(200);
		lenovo.setWidth(20);
		lenovo.bootLaptop();

		// System.out.println(lenovo.toString());


	}

}
