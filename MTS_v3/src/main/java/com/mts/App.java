package com.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// Init

		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"appln-layer.xml","infra-layer.xml"});
		System.out.println("=============================================");
		// Use

		TxrService txrService = (TxrService) applicationContext.getBean("txrService");

		txrService.txr("1", "2", 1000.00);

		// Destroy
		System.out.println("=============================================");
		applicationContext.close();

	}

}
