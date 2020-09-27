package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword {

    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
            // Using the text of the anchor tag to locate a
        WebElement homeLink= driver.findElement(By.xpath("//a[.='Home']"));

        // if I want to locate the same web element using the class attribute value
        //WebElement homeLink= driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        WebElement header= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox= driver.findElement(By.cssSelector("input[type='text'"));

        //e. “Retrieve password” button
        //Using css selector to locate this button
        // Option #1: using this syntax --> button#form_submit
        // Option #2: using this syntax --> button[id='form_submit']
        // Option #3: using this syntax --> button[class='radius']
        // Option #4: button.radius
        WebElement retrievePasswordButton= driver.findElement(By.cssSelector("button.radius"));

        //f. “Powered by Cybertek School” text
        WebElement linkText =driver.findElement(By.xpath("//a[.='Cybertek School']"));
        WebElement poweredByDiv= driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("linkText = "+linkText.getText()); // short cut linkText.soutv +enter
        System.out.println("poweredByDiv = "+poweredByDiv.getText());


        //4. Verify all WebElements are displayed.


    }
}
