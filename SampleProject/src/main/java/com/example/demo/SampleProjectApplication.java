package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SampleProjectApplication.class, args);
		
		Android a1  = context.getBean(Android.class);
		
		Iphone I1= context.getBean(Iphone.class);

		Carrier carrier1= context.getBean(Carrier.class);
		
		Carrier carrier2= context.getBean(Carrier.class);
		
		carrier1.setLocation("Colerain");
		carrier1.setName("Tmobile");
		carrier1.setPrice_tag(850.00);
		
		carrier2.setLocation("Clifton");
		carrier2.setName("AT&T");
		carrier2.setPrice_tag(1110.00);
		

		a1.setCarrier(carrier1);
		I1.setCarrier(carrier2);
		a1.getCarrier().display();
		
	}
	

	}

