package com.cybertek.tests.day7_webtables;

import com.cybertek.utilities.SmartBearUtilities;
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

            //TC#3: SmartBear software order verification
public class WebTablePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser and login to Smartbear software
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);

        /*
        WebElement userNameInputBox=driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
        WebElement passwordInputBox= driver.findElement(By.id("ctl00_MainContent_password"));
        userNameInputBox.sendKeys("Tester"+Keys.TAB);
        passwordInputBox.sendKeys("test"+ Keys.TAB);
        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        */


    }

    @Test
    public void p3_verify_susans_order_date(){

        //2. Click on View all orders
        WebElement viewAllOrders=  driver.findElement(By.linkText("View all orders"));
        viewAllOrders.click();
        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susansDate= driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
        String expectedDate= "01/05/2010";
        String actualDate = susansDate.getText();

        //Assert.assertTrue(actualDate.equals(expectedDate));
        Assert.assertEquals(actualDate,expectedDate,"Dates are NOT same");
        //Assert.fail("I AM FAILING THIS TEST ON PURPOSE");

    }

    @AfterMethod
        public void tearDown(){

    driver.close();

    }

}
