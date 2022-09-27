package com.countrylistbrowser.countrylistbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class ListOfCountry {

    public ListOfCountry() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://data.worldbank.org/country");
        driver.manage().window().maximize();


        driver.findElement(By.className("alphabet")).click();
        driver.findElement(By.linkText("G")).click();
    }
}
