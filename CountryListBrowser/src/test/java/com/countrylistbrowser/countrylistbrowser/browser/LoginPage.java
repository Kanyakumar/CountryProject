package com.countrylistbrowser.countrylistbrowser.browser;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.springframework.stereotype.Component;

@Component

public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "India")
    public WebElement txtIndia;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName)
    {
        txtIndia.sendKeys(userName);

    }

    public HomePage ClickLogin() {
        btnLogin.click();
        return new HomePage();
    }



}
