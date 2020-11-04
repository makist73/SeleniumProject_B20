package com.cybertek.tests.day6_dropdown_rewiew_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

import java.util.concurrent.TimeUnit;

public class DropdownTasks {

    WebDriver driver;

   // @BeforeClass
   // public void setupClass(){
    //    driver = WebDriverFactory.getDriver("chrome");
   // }

    @AfterMethod
    public void tearDownMethod (){
    driver.close();
}

    @BeforeMethod
    public void setupMethod(){
        // open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        // maximize the page
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // get the page
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    //TC #2: Selecting state from State dropdown and verifying result
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException{
        //we need to locate the dropdown
        Select stateDropdown =new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois -->selecting by visible text
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia -->selecting by value
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California--> selecting by index
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedResult = "California";
        String actualResult=stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult, "Actual vs expected is not equal!");

        //Use all Select options. (visible text, value, index)




    }

    //TC #3: Selecting date on dropdown and verifying
    @Test
    public void test3_date_dropdown_verification(){

        //locate all the web elements/dropdowns
    Select yearDropdown =new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown =new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown =new Select(driver.findElement(By.xpath("//select[@id='day']")));



        //3. Select “December 1st, 1921” and verify it is selected.
        //Selecting  year using text
        yearDropdown.selectByVisibleText("1921");

        //Selecting month using by attribute value "value"
        monthDropdown.selectByValue("11");

        //Selecting  day 1 by using index number
        dayDropdown.selectByIndex(0);

        //creating expected values in one place
        String expectedYear ="1921";
        String expectedMonth ="December";
        String expectedDay ="1";

        // getting our actual values from the web page
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //creating assert lines to compare actual vs expected
        Assert.assertEquals(actualYear, expectedYear, "Actual year vs expected year not equal");
        Assert.assertEquals(actualMonth, expectedMonth, " Actual month vs expected month not equal");
        Assert.assertEquals(actualDay, expectedDay, "Actual day vs expected day not equal");
    }
}
