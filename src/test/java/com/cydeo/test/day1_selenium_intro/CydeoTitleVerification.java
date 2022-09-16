package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {

    public static void main(String[] args) {

        //1 setup driver
        WebDriverManager.chromedriver().setup();

        //2 - create instane of driver
        WebDriver driver = new ChromeDriver();

        //3 - making window full screen maximize
        driver.manage().window().maximize();

        //4 - get driver
        driver.getTitle("htts://www.cydeo.com");

        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED" +);
        }else{
            System.out.println("Title verification has failed");
        }

            driver.quit();

    }
    }




