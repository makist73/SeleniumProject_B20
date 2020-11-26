package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");


    }
    /*
    TC	#	:	Window	Handle practice
    1. Create	a	new	class	called:	WindowHandlePractice
    2. Create	new	test	and	make	set	ups
    3. Go	to	:	http://practice.cybertekschool.com/windows
    4. Assert:	Title	is	“Practice”
    5. Click	to:	“Click	Here” text
    6. Switch	to	new	Window.
    7. Assert:	Title	is	“New	Window”
     */

        @Test
        public void p5_handling_windows(){


        }

}
