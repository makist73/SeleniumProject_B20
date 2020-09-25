package com.cybertek.tests.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {

    public static void main(String[] args) {
        //TC	#1:	Google	Title	Verification
        WebDriverManager.chromedriver().setup();
        //1. Open	Chrome	browser
        WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
        //2. Go	to	https://www.google.com
        driver.get("https://www.google.com");
        //3. Verify	title:
        //Expected:	Google

        String expectedTitle="Google";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

    }
}
