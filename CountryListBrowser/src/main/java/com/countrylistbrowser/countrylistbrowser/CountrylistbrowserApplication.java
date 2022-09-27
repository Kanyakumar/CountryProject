package com.countrylistbrowser.countrylistbrowser;

import lombok.var;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountrylistbrowserApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CountrylistbrowserApplication.class, args);
		var country = context.getBean(ListOfCountry.class);
		country.getClass();
	}

}
