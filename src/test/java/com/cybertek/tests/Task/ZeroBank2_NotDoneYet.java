package com.cybertek.tests.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank2_NotDoneYet {

    public static void main(String[] args) {

        //TC #2: Zero Bank link text verification
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify link text from top left:
        //Expected: “Zero Bank”

        WebElement text = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = text.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification is PASSED!");

        }else{
            System.out.println("Link text verification is FAILED!!!");

        }
        //4. Verify link href attribute value contains:
        //Expected: “index.html”

          /*
    TIPS FOR TASK #2:
5. get the attribute value of href using .getAttribute() method and store it in actualHREF
String
6. Create expectedInHREF String
7. Create if conditions to check actual value contains the expected value
     */
    }

}