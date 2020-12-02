package com.cybertek.tests.day11_utils_review_actions;

public class ClassNotes17 {

    /*
    Oct 6th, Tuesday
Today's schedule
    - Review on Properties
    - Review on Driver Utils
    - Singleton Design Pattern example
        - Debugging on singleton example
        - Debuggin on driver
    - Action class
==========================================================================
Properties utilities:
    - What is properties utility, and why are we using it?
        - Properties utility is the class and the method we created so that we can read IMPORTANT TEST DATA from outside of our source code.
        - This utility and logic allows us to AVOID HARDCODING the important test data.
        - So that we can change the test data such as browser type, username, password, URL.
    HARDCODING : is putting the data in our source code.
        - If you have to go into the actual code itself to change the data, it means it is hard coded.
    DATA DRIVEN TESTING:
        - Running the same tests against different test data.
    configuration.properties
    -> it is just another type of file.
    -> configuration ==> the name of the file
    -> .properties ==> is the type of the file.
    => .properties type of file stores information in key=value format
    .properties files are mainly used in Java programs to maintain project configuration data, database config or project settings, etc. Each parameter in properties file is stored as a pair of strings, in key-value pair format, where each key is on one line. You can easily read properties from some file using an object of type Properties. This is a utility provided by Java itself.
    EX: key=value
        browser=chrome
        username=john
        password=12345
        url=qa1.vytrack.com
        ConfigurationReader.getProperty("browser"); --> return chrome
        ConfigurationReader.getProperty("username"); --> return john
        ConfigurationReader.getProperty("url"); --> return qa1.vytrack.com
P.I.Q:  How are we reading from properties file?
    #1-> I create the Properties class object.
    #2-> I create a FileInputStream object to be able to open the file, and pass the path of "configuraion.properties" file into the constructor
    #3-> I load the opened file into the properties object
    #4-> Read from the file using .getProperty method that comes from Properties class object.
    #1- Properties properties = new Properties();
    #2- FileInputStream file = new FileInputStream("configuration.properties");
    #3- properties.load(file);
    #4- properties.getProperty(keyWord);
========================================================================
Driver Utility Class:
    - What is Driver utility class and why are we creating it?
    We have some challenges that we want to overcome:
        #1-> Too many lines just to create and instantiate a WebDriver instance and do setup.
        #2-> Our driver instance is not re-usable.
            - Currently our driver instance lives and dies in the same class.
            - If we want to pass the driver instance in a method from another class, we must pass that specific instance into that method every time.
            Ex: SmartBearUtils.login(driver);
    To be able to overcome these challenges, and make our code more stable and easy to maintain, we create Driver utility class.
    We used Singleton Design Pattern to create the logic in our Driver utility.
    -> What is Singleton Design Pattern and how do we achieve it?
        #1- We make the constructor private to limit access to it so that nobody can create object of this class without our permission. (ENCAPSULATION)
        #2- Therefore we create a GETTER method which allows user to get the version of the object we allow them to get.

     */
}
