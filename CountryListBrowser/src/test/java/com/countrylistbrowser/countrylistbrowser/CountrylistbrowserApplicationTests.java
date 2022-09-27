package com.countrylistbrowser.countrylistbrowser;

import com.countrylistbrowser.countrylistbrowser.browser.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest(classes = CountrylistbrowserApplication.class)
@Profile("dev")
class CountrylistbrowserApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	CountrylistbrowserApplicationTests(MainPage mainPage, String appUrl, List<String> browsers) {
		this.mainPage = mainPage;
		this.appUrl = appUrl;
		this.browsers = browsers;
	}

	@Test
	void performLoginTest() {



		mainPage.PerformLogin();
	}

}
