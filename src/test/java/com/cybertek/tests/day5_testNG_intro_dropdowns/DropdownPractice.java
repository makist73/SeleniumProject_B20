package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    WebDriver driver;

    @BeforeMethod
    public void dropDownSetUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void simpleDropDownDefaultValueVerification() throws InterruptedException {

        Select simpleDropDown= new Select(driver.findElement(By.id("dropdown")));
        String actualSelectedOption=simpleDropDown.getFirstSelectedOption().getText();
        String expectedSelectedOption="Please select an option";

        //WebElement simpleDDDefaultValue=driver.findElement(By.xpath("(//option[@selected='selected'])[1]"));
        //String expectedSelectedOption="Please select an option";
        //String actualSelectedOption= simpleDDDefaultValue.getText();

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption, "Value is not equal"  );

        Thread.sleep(2000);
        simpleDropDown.selectByVisibleText("Option 2");

    }

    @Test
    public void simpleDropDown(){
        WebElement dropDownLink=driver.findElement(By.linkText("Dropdown link"));
        dropDownLink.click();
        WebElement amazonLink=driver.findElement(By.xpath("//a[.='Amazon']"));
        amazonLink.click();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        //driver.close();
    }
}
