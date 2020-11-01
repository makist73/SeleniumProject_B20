package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // 1-go to google
        driver.get("https://www.google.com");

    }

    @Test
    public void google_title_verification(){

        // 1-go to google
        //driver.get("https://www.google.com"); // moved to beforeMethod to run for both tests

        // 2- Verify title is Google
        String expectedTitle="Google";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching!");

    }
    @Test
    public void google_search_title_verification(){
        // go to google --> this part will be taken care of in the beforeMethod

        // search apple
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

        // make sure title contains apple
        String  expectedInTitle = "apple";
        String actualTitle= driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle), "Title does not contain search value.");



    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }


}
