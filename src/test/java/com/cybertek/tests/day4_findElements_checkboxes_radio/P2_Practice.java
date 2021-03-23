package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_Practice {

    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
                //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
                //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText=0;
        int linksWithText=0;
        //3. Print out the texts of all links
        for (WebElement eachElement: listOfLinks){
            System.out.println("eachElement = " + eachElement.getText());
            if (eachElement.getText().isEmpty()){
                linksWithoutText++;
            }if(!eachElement.getText().isEmpty()){
                linksWithText+=1;
            }
        }
        //4. Print out how many link is missing text
        System.out.println("linksWithoutText = " + linksWithoutText);
          //5. Print out how many link has text
        System.out.println("linksWithText = " + linksWithText);

        //6. Print out how many total link
        System.out.println("Total Link = " + listOfLinks.size());





    }
}
