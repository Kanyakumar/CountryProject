package com.countrylistbrowser.countrylistbrowser.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class HomePage extends BasePage{

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void InitHomePage(){
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Country")
    public WebElement lnkCountry;

    @FindBy(how = How.LINK_TEXT, using = "India")
    public WebElement lnkIndia;

    public LoginPage ClickLogin()
    {
        lnkCountry.click();
        System.out.println("Click Login");
        return new LoginPage();
    }

    public void ClickIndia() {
        lnkIndia.click();}
}
