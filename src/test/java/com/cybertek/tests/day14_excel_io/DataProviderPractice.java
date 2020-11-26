package com.cybertek.tests.day14_excel_io;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DataProviderPractice {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;

    @FindBy (id = "prependedInput2")
    private WebElement passwordElement;

    @Test
    public void ddtLoginTest1(){


    }
}
