package com.cybertek.tests.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        //TC #1: Zero Bank title verification
        // set up the web driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver= new ChromeDriver();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify title
        //Expected: “Zero - Log in”
        String expectedTitle="Zero - Log in";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification is PASSED!");
        }else{
            System.out.println("Verification is FAILED!!!");
        }

    }
}
