package com.mob.webriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class mobhome {
    @Test
    public void startWebDriver(){
       WebDriver driver =new FirefoxDriver();
        driver.navigate().to("http://hm-decor.com.ua");
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[2]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[3]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[4]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[5]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();

    }



}



