package com.mob.webriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome {
    public WebDriver driver;

@Test
    public void testChrome(){
    System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chrome\\chromedriver.exe");
    driver  =new ChromeDriver();
        driver.get ("https://google.com.ua");
        driver.close();

    }
}