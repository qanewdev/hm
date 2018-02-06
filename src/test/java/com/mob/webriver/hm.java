package com.mob.webriver;

import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hm {
    private WebDriver driver;



    @Test
    public void testMenuTop() {
        driver = new FirefoxDriver();
        driver.get("http://hm-decor.com.ua/");
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[2]/a/span")).click();
        driver.findElement(By.cssSelector("span.menu-title")).click();
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[4]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='mainmenutop']/div/div/ul/li[5]/a/span")).click();
        driver.quit();
    }

}