package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        WebElement emailInputBox =driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@gmail.com");

        String actualHeader= driver.findElement(By.tagName("h2")).getText();
        String expectedHeader="Forgot Password";
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification PASSED!");
        }else{
            System.out.println("Header Verification FAILED!!!");
            System.out.println("expectedHeader = " + expectedHeader);
            System.out.println("actualHeader = " + actualHeader);
        }
        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
                   retrievePasswordButton.click();

         String expectedConformationMessage= "Your request sent";
         String actualConformationMessage = driver.findElement(By.tagName("h1")).getText();

         if (actualConformationMessage.equals(expectedConformationMessage)){
             System.out.println("Conformation Message Verification PASSED!");
         }else{
             System.out.println("Conformation Message Verification FAILED!!!!");
             System.out.println("expectedConformationMessage = " + expectedConformationMessage);
             System.out.println("actualConformationMessage = " + actualConformationMessage);
         }

        driver.close();
    }
}
