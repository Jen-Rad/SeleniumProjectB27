package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        //1-Setting up Web driver manager
        WebDriverManager.chromedriver().setup();

        //2-Create up instance

        WebDriver driver = new ChromeDriver();
        //webdriver is interface and ChromeDriver is

        //3 Test if driver is working
        driver.get("https://www.google.com");

        //name the method - get title

        String title = driver.getTitle();
        //get a title as a string using the title method

        System.out.println("Title of the page " + title);

        if(title.equals("Cydeo")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        //close driver after the page is done
        driver.quit();




}}
