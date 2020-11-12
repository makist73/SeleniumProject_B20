package com.cybertek.tests.day2_locators_getText_getAttribute;

public class ClassNotes5 {
    /*
    CLASSNOTES-5
AUG 27TH, THURSDAY


-> WHAT IS SELENIUM?
- A set of libraries that helps us automate browses
- Primarily it is for automating web applications for testing purposes
- Selenium—- jar files(libraries) that has ready classes and methods that allows us to automate browsers


-> WHAT IS MAVEN?
- it's a built automation tool, helps us to automate creating JAVA projects

-> WHAT IS BUILT?
- Built is the repeated processes when you are creating a project

-> IS MAVEN FOR TESTERS?
- No. Its not for testers.
- But we use it to take advantage of some of its functionalities.

-> WHY ARE WE USING?
#1- pom.xml file : it helps us automate adding & removing & managing dependencies.
What is a dependency?
-> Its basically some external libraries that we want to add to our project.
What dependencies we added when we created our project?
-> WebDriverManager : 4.1.0
-> Selenium-Java : 3.141.59

#2- Pre-configured folder structure that comes with it by default.

-> src
-> main
-> test
-> java.com.cybertek
-> tests
-> day1
-> day2
-> day3

.findElement(BY.LOCATOR) ->
-> findElement method is used to find web elements for selenium.
-> This method finds and returns one web element.
-> findElement method uses locators to find elements from the HTML of the page.
-> What happens when findElement method cannot find the web element?
NoSuchElementException

WHAT IS A LOCATOR? HOW MANY LOCATORS IN SELENIUM?
-> Locators help us find web elements for the selenium webdriver.
-> There are 8 locators.

<a> </a>
ex: <a href="/forgot-password.html" tabindex="5">Forgot your password ?</a>

tagName : a
attribute :
attribute #1: href
attribute #2: tabindex
attribute value
attribute value #1: /forgot-password.html
attribute value #2: 5

TEXT: Forgot your password ?


ex: <a href="/forgot-password.html" tabindex="5">Forgot your password ?</a>

#1: linkText : locates a webElement by it text.
-> linkText is looking for EXACT TEXT MATCH.
-> It means we have to pass the whole text of the link. We cannot miss any part.

syntax:
-> driver.findElement(By.linkText("Forgot your password ?"));

#2: partialLinkText :
-> partialLinkText is looking for PARTIAL TEXT MATCH.
->These locators ONLY works for locating LINKS.
-> It means we can pass any part of the text. It will find and return that matching web element.

syntax:
-> driver.findElement(By.partialLinkText("Forgot your pas"));

#3: id
#4: className
#5: tagName
#6: name
     */

}
