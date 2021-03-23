package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class P1_Practice {

    public static void main(String[] args) throws InterruptedException{


    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/forgot_password");

    //WebElement emailBox = driver.findElement(By.cssSelector("[name='email']"));
     WebElement emailBox= driver.findElement(By.xpath("//input[@name='email']"));

    //emailBox.sendKeys("abcde@gmail.com"+ Keys.ENTER);
    emailBox.sendKeys("abcde@gmail.com");
    //Thread.sleep(1000);
    emailBox.sendKeys(Keys.ENTER);



    }
}
