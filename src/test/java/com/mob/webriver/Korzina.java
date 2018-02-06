package com.mob.webriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Korzina {

    @Test
    public void buy() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://hm-decor.com.u");
        driver.findElement(By.cssSelector("h3.name")).click();
        driver.findElement(By.id("button-cart")).click();
        driver.findElement(By.id("cart-total")).click();
        driver.findElement(By.linkText("Оформление заказа")).click();
        Thread.sleep(5000);
        driver.close();
    }

}
