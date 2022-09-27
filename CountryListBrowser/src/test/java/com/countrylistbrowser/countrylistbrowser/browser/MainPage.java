package com.countrylistbrowser.countrylistbrowser.browser;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component

public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public MainPage(LoginPage loginPage, HomePage homePage, WebDriver webDriver) {
        this.loginPage = loginPage;
        this.homePage = homePage;
        this.webDriver = webDriver;
    }

    public void PerformLogin() {

        webDriver.navigate().to("https://data.worldbank.org/country");
        homePage.ClickLogin();
        loginPage.Login("India");
        loginPage.ClickLogin();
    }
}
