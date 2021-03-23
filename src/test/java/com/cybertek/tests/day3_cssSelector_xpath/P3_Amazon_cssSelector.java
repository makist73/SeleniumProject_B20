package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelector {

    public static void main(String[] args) {
        //TC #3: Amazon link number verification
        // 1. Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        // 3. Enter search term (use cssSelector to locate search box)
        // Locating a web element using the first syntax in cssSelector

        //WebElement searchBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchBox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        
        // expected
        // actual
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle=driver.getTitle();
        
        // 4. Verify title contains search term
        // create if condition
        
        if (actualTitle.contains("search")){
            System.out.println("yes it contains search term");
            System.out.println("actualTitle = " + actualTitle);
        }else{
            System.out.println("Title does not contains search term");
            System.out.println("actualTitle = " + actualTitle);
        }
        
    }
}
