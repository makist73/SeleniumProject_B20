package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_Practice {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver =WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement singleCheckBox= driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        WebElement successMessage=driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
        //3. Verify “Success – Check box is checked” message is NOT displayed.
        if(!singleCheckBox.isSelected() && !successMessage.isDisplayed() ){
            System.out.println("Message is not displayed. Verification PASSED!");

        }else{
            System.out.println("Message is displayed. Verification FAILED!!!");

        }
        //4. Click to checkbox under “Single Checkbox Demo” section
         singleCheckBox.click();
        //5. Verify “Success – Check box is checked” message is displayed.
        if (singleCheckBox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Message is displayed. Verification PASSED!");
        }else{
            System.out.println("Message is not displayed. Verification FAILED!!!");
        }

        Thread.sleep(1000);
        driver.close();
    }
}
