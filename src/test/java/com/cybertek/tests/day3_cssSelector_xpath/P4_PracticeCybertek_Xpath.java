package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class P4_PracticeCybertek_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // locate button 2 and click on it
        // only using xpath
        //WebElement button2= driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[2]"));
        //button2.click();
       WebElement button6 = driver.findElement(By.xpath("//button[@onclick='button6()']"));
       //Thread.sleep(1000);
       button6.click();
        //WebDriverWait wait =new WebDriverWait(driver,10);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
