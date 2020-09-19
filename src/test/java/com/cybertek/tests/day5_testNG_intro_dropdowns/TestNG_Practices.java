package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //driver = WebDriverFactory.getDriver("chrome");

    }


    @Test
    public void google_title_verification(){
        // 1-go to google
        // 2- Verify title is google
    }



}
