package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //waits until the page is loaded for the given time.
        // it will wait up to 15 seconds, if page is loaded before that it will continue.
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    @Test
    public void google_title_verification(){

        // 1-go to google
        driver.get("https://www.google.com");

        // 2- Verify title is Google
        String expectedTitle="Google";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching!");

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }


}
