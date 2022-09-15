package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {

        //1st step - setup Webdriver Manager
        WebDriverManager.chromedriver().setup();

        //2nd step - opening an empty driver - creating an instance of driver
        WebDriver driver = new ChromeDriver();

        //3 step -- navigate to page - go to https://
        driver.get("https://www.tesla.com");








    }


}
