package com.cybertek.tests.day8;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp()  {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);
        driver.get("http://practice.cybertekschool.com/");

    }
    @Test
     public void iframeTest_1(){

        WebElement framesLink= driver.findElement(By.xpath("//a[.='Frames']"));
        framesLink.click();
        driver.findElement(By.linkText("iFrame")).click();
       // driver.switchTo().frame(0);

        driver.findElement(By.xpath("//button[.='Ok']")).click();
        driver.switchTo().frame(0);
        WebElement tinyMCE = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        tinyMCE.clear();
        tinyMCE.sendKeys("I'm a Tester");
        BrowserUtils.wait(2);

        String actualText=driver.findElement(By.tagName("p")).getText();
        String expectedText= "I'm a Tester";

        Assert.assertEquals(actualText,expectedText, "Text is not same. Verification FAILED!!!");
        driver.navigate().back();

        }


@AfterMethod
    public void tearDown(){
        driver.close();
}

}
