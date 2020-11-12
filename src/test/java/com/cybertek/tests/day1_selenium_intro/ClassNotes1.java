package com.cybertek.tests.day1_selenium_intro;

public class ClassNotes1 {

    /*
    CLASSNOTES-3
Saturday, 22nd August

HTML -->
- HYPERTEXT MARKUP LANGUAGE
- It is a MARKUP LANGUAGE.
- Markup languages uses TAGS to create a certain structure.

WHAT IS A TAG?
- Tags act like containers in markup languages..
- Tags allows users to apply specific structure to the content they are using.

How many types of tags are there?
- There are 2 types of tags.

1- Paired tag: aka (also known as) non-self closing tag
sytax: <openingTag> content goes here </closingTag>

ex: p, title, h1, em, ul, ol, div, table, a

<p> paragraph content </p>
<title> Google </title>

2- Unpaired tag: aka (also known as) self-closing tag

sytanx: <tag />

ex: <hr> -> horizontal ruler
<br>
<img src="">

What is an attribute in HTML?
- Attributes provide additional information about tags
- If a tag is a paired tag, attributes ALWAYS GO into OPENING TAG.

<a href= "https://google.com" class= "with blond hair"> GOOGLE </a>
<a href= "https://google.com" class= "with black hair"> GOOGLE </a>

Attribute value: everything that is passed after = sign and into ""

What is the actual content of a web element?
- The part that is in between the opening tag and the closing tag.

EX#1 : <a href="https://google.com"> CLICK HERE TO GO TO GOOGLE </a>

WHICH ONE IS THE TAG? --> a
WHICH ONE IS ATTRIBUTE --> href
WHICH ONE IS ATTRIBUTE VALUE --> https://google.com
WHICH ONE IS THE ACTUAL CONTENT --> CLICK HERE TO GO TO GOOGLE

If you are using chrome browser: (USUALLY!!!)
- Purple : tag
- Orange : attribute name
- Blue : attribute value
- Black : text displayed on the page (content)

How do you automate CAPTCHA?
- You cannot automate captcha. That is the hole point of having captcha.
- BUT you can get a BYPASS from the developers that will allow your automation code to just skip the CAPTCHA.

HOW DOES SELENIUM + DRIVER + BROWSER WORK TOGETHER?

- Browser does not understand Selenium+Java code.
- That's why we MUST have browser driver to be able to execute our selenium code in our browser.
- Think of the browser driver as the TRANSLATOR in between the browser and our SELENIUM+JAVA code.


MULTIPLE WAYS OF ADDING SELENIUM TO A PROJECT:
1- Download and Add selenium jar files yourself manually.
-> download and add webdrivers for each browser.

2- Create maven project:
-> Add selenium dependency into pom.xml file
-> download and add webdrivers for each browser.

3- Create maven project:
-> Add selenium dependency into pom.xml file
-> Add the WebDriverManager dependency

IMPORTANT NOTES ABOUT MAVEN:
POM.XML ->
POM -> PROJECT OBJECT MODEL
XML -> EXTENSIBLE MARKUP LANGUAGE

-> pom.xml file is one of the most important files in the project
-> in this file we manage our dependencies.
-> WHAT IS A DEPENDENCY?
-> It is just a set of libraries that contains some ready classes and methods.
-> We control the project dependencies from pom.xml file

STEP BY STEP CREATING A NEW PROJECT AND ADDING SELENIUM AND WEBDRIVER MANAGER:

1- Click to "new project"

2- Select Maven from left, and click next

3- We need to add name of the project and, artifactId/groupId if needed
groupID : is the company that owns the project (usually domain name)
com.something
artifactID : the project name. Whatever you pass into project name becomes the artifactId.
4- click to finish to create the project

5- in the pom.xml file create new tag called <dependencies></dependencies

6- open browser and go to : https://mvnrepository.com/

7 - search for ‘selenium java’ in the search bar

8- Click to first result 'selenium-java'

9 - select 3.141.59 version (or the latest non alpha or beta) version

10 - ADD SELENIUM dependency into pom.xml file, inside of <dependencies> tag
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>3.141.59</version>
</dependency>

11- ADD BONIGARCIA(WEBDRIVERMANAGER)

-> search for bonigarcia in mvnrepository and get dependency

-> click to WebDriverManager

12- Select latest non alpha/beta version
which is right now: 4.1.0

https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.1.0


TO ENABLE AUTO IMPORT ->

FOR MAC: GO TO PREFERENCES > Type "auto" in the search bar
select both options

FOR WINDOWS: GO TO SETTINGS > Type "auto" in the search bar
select both options


error: java: release version 5 not supported

Easy solution: copy paste this into pom xml above dependencies tag
<properties>
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>
</properties>

This is not error. this is normal to have. -->
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".


//1- Setup the driver
WebDriverManager.chromedriver().setup();
--> We just call methods from WebDriverManager dependencies to set up our browser driver.
--> Another way of setting up the driver, if you are not using WebDriverManager:
System.setProperty("driver.type","path to the driver");


//2- Create instance of the driver
WebDriver driver = new ChromeDriver();

#1- Creating the instance of the driver we are going to be using
#2- This line opens you a blank browser.
#3- Every browser that is opened is cache free browser. Browsing history is not saved.

//3- Use the driver instance to test selenium
driver.get("https://www.google.com");

.get METHOD :
-> ACCEPTS A STRING AS A PARAMETER
-> Gets the web page link that we give using selenium webdriver

driver.getTitle();
- This method does not accept any parameters
- Returns the title of the page as a String
- RETURN TYPE: String

driver.getCurrentUrl();
- This method returns the current URL value as a String
- This method does not accept any arguments
- RETURN TYPE: String


SHORTCUT: After creating a new variable, easy way to print out :
String str1 = "something";

str1.soutv + enter --> it will generate System.out.println("str1 = " + str1);

BASIC NAVIGATIONS USING SELENIUM:

Basic navigations contains : back(), forward(), refresh(), and to() methods.

These methods are doing simple actions as if the user has clicked the buttons on the browser.

--> driver.navigate().back();
-> This method will take the page the the previous page. You just go back.

--> driver.navigate().forward();
-> This method will take the page to the forward page.

--> driver.navigate().refresh();
-> This method just refresh the page.

--> driver.navigate().to("URL");
-> This method is similar to driver.get(); method.
-> It does exactly the same thing the .get() method is doing.
-> It goes to the given URL.
-> The only difference in between .get() vs .navigate().to() is get method waits for page to load. But the .to() method does not wait for the page to load.


driver.getPageSource();
--> returns the page source as a string

driver.manage().window().maximize();
--> basically this line makes your browser maximized


driver.manage().window().fullscreen();
--> works only in macs.
--> same as clicking to the green button from the top left corner


driver.close();
--> just closes the last opened window of the browser
--> this only closes the last one

driver.quit();
--> quit method closes all of the browsers opened in that session
     */
}
