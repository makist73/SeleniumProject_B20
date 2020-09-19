package com.cybertek.tests.day1_seleniun_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // 1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //System.setProperty("driver.type","path to the driver");
        //System.setProperty("webdriver.chrome.driver","path to the driver");

        // 2- create the instance of the driver
        WebDriver driver= new ChromeDriver(); // this opens the driver(browser)

       driver.manage().window().maximize();

        // 3- use the driver instance to test selenium
        driver.get("https://www.google.com");// test if driver is working


        //System.out.println("The title of the page is: "+driver.getTitle());// first way

        String actualTitle=driver.getTitle();
        System.out.println("Actual title String: " +actualTitle);

        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(1000); // stops 1 second

        driver.navigate().back(); // will take the page to the previous page. Goes back

        Thread.sleep(1000);
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");// load new webpage in the current browser window

        String pageSource=driver.getPageSource();
        System.out.println("pageSource "+pageSource);

      //  driver.manage().window().fullscreen();

        driver.close();
    }

}
