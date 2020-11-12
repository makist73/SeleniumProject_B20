package com.cybertek.tests.day2_locators_getText_getAttribute;

public class ClassNotes2 {

    /*
    CLASSNOTES-4
AUG 23rd, SUNDAY


Link to the github page for the daily packages:

https://github.com/CybertekSchool/spring-2020-b20-automation/tree/master/src/test/java/com/cybertek/tests

What is Selenium?
-> Selenium is basically some jar files(libraries) that has ready classes and methods that allows us to automate browsers.

-> In simple terms, it is basically some jar files.
-> We use these jar files to automate browsers, and test cases related to UI.


What is Maven?
-> Maven is a built automation tool.
-> Maven helps us automate creating projects.
-> When we create a project with maven following things happen:
#1 - Pre-configured folder structure is created.
projectName
-> src folder
-> main --> folder: is used by developers to build the application
-> test --> folder: is used by developer to create unit tests

#2 - pom.xml file comes with the project.

-> pom.xml file is the most important file in a maven project
-> we manage our dependencies from our pom.xml file
-> it helps us add and maintain the versions of our dependencies

--> Java version : 8
--> Selenium version : 3.141.59
--> WebDriverManager version : 4.1.0


What is built? : repeating steps to create a project.

--> creating the folder structure
--> compile
--> add jar files, dependencies
--> deploying

Built is the repeated processes when you are creating a project


Is maven for testers?
- NO.
- But as testers we are taking advantage of some of the functionalities provided by maven; such as pom.xml file and the existing src->test folder structure.

Are we going to use the maven to its all functionalities?
- NO.
- We will only use some of the basic functionalities of the maven.
ex: such as pom.xml file and the existing src->test folder structure.


So if the developers are using both main and test folders, where do testers work?
-> Testers and developers are working on different projects(in intelliJ).

What do we verify as testers?
-> We verify actual result vs expected result on anything.

Where does the expected results come from?
-> Documentation: AC, Requirement etc

Where do we get the actual results from?
-> We get the actual result from the browser after doing the test execution using Selenium methods.

To be able to do any action on any web element, we need to LOCATE the web element.


.findElement(By.locator) :
--> findElement method is used to find web elements for selenium.
--> This method finds and returns one web element.


What are locators in Selenium?
--> Locators help us find web elements for the selenium webdriver.
--> There are 8 different locators in Selenium.



#1 --> linkText("THE TEXT OF THE LINK"):
--> Looks through the texts of the links on the page and returns the matching link as a web element.
--> This locator ONLY works for locating LINKS.
--> How do we know if it is a link or not?
-> When we inspect, if we see the tag is <a> then it is a link.
--> We MUST pass the TEXT of the link.
--> This method/locator is looking for an EXACT text match of the link.

<a href="https://www.google.com" > CLICK HERE TO GO TO GOOGLE </a>

which one is tag : a
which one is attribute : href
which one is the attribute value of href : https://www.google.com
which one is the text of THIS webelement : CLICK HERE TO GO TO GOOGLE


syntax: driver.findElement(By.linkText("the text of the link we want to locate"));

<a href="https://www.google.com" > CLICK HERE TO GO TO GOOGLE </a>

ex: driver.findElement(By.linkText("CLICK HERE TO GO TO GOOGLE")).click();

To activate inspection tool with keyboard shortcut:
MAC : COMMAND + SHIFT + C
Windows : CNTRL + SHIFT + C


#2 -> partialLinkText()
-> partialLinkText is looking for partial text match.
-> if there are more than 1 match, it will return the first web element and do the action on it.
-> we can only use this with LINKS. (Anchor tags)

<a href="https://www.google.com" > CLICK HERE TO GO TO GOOGLE </a>

ex: driver.findElement(By.partialLinkText("CLICK")).click();
ex: driver.findElement(By.partialLinkText("GOOGLE")).click();
ex: driver.findElement(By.partialLinkText("HERE")).click();
ex: driver.findElement(By.partialLinkText("CLICK HERE TO GO TO GOOGLE")).click();

Compared to java methods:

-linkText() method is similar to equals() method.
-It looks for the exact STRING MATCH.
-partialLinkText() method is similar to contains() method.
-It looks for partial STRING MATCH.



#3 - name :
- name is one of the 8 locators in the Selenium.
- looks through the html code for the name attributes, and returns the webelement with matching value.



<a name="ubt-7" href="https://www.google.com" > CLICK HERE TO GO TO GOOGLE </a>

ex:
driver.findElement(By.name("ubt-7")).click();


HOW TO WRITE SOMETHING USING SELENIUM?
- .sendKeys(STRING) -->
- This method accepts a string parameter
- And will send the keys that are passed into it.

syntax : driver.findElement(By.name("asdf")).sendKeys("Words to be send to page");


#4 - id :
-> id is one of the 8 locators of selenium
-> id looks for "id" attribute value
-> id has to be unique value.
-> sometimes id can be dynamic. Dynamic means everytime you refresh the page it changes. -> But most of the time it is STATIC. Which means it does not change.

syntax : driver.findElement(By.id("asdf")).sendKeys("Words to be send to page");

#5 - className
--> "className" is one of the 8 locators of Selenium
--> same as the name and id. But it looks for the attribute value of "class"
--> since "class" keyword is taken in java, selenium developers made this locator name "className"
--> but it looks for the attribute value of the "class" attribute


syntax : driver.findElement(By.className("asdf")).sendKeys("Words to be send to page");

#6 - tagName:
--> "tagName" is one of the 8 locators of Selenium
--> "tagName" find web elements by their tag name.


syntax: driver.findElement(By.tagName("a"))
syntax: driver.findElement(By.tagName("div"))
syntax: driver.findElement(By.tagName("span"))
syntax: driver.findElement(By.tagName("h1"))

--> it will find and return the first matching web element.
--> and any action(such as: sendKeys, or click) will be applied to the first web element.


========================================

.getText();

- gets text of the web element
- getText() method only gets the text from in between the OPENING and the CLOSING
- getText() method does not accept any arguments
- return type is String.
- it returns the text of the web element as a String.

syntax:

<openingTag id="abc7"> something </closingTag>

ex: Write the line to get the text "something" from the above web element

driver.findElement(By.id("abc7")).getText(); --> Returns "something" as a String


.getAttribute("attribute");
- similar to getText method, it returns a String
- this method returns the given ATTRIBUTE's value as a String.
-

syntax:

<openingTag id="abc7" class="ubt7"> something </closingTag>

ex: Write the line that will return the "id" attribute value.

driver.findElement(By.className("ubt7")).getAttribute("id"); ===> this will return me:abc7

<-----finds the web element------------><---returns the id value-->
     */
}
