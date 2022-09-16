package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args)throws InterruptedException {

        //1st step - setup Webdriver Manager
        WebDriverManager.chromedriver().setup();

        //2nd step - opening an empty driver - creating an instance of driver
        WebDriver driver = new ChromeDriver();

        //3 step -- navigate to page - go to https://
        driver.get("https://www.tesla.com");
        System.out.println(" driver.getTitle()" + driver.getTitle());
        //store this title in return type;
        //return type of get title method:

        driver.navigate().to("https://www.google.com");
        String currentTitles = driver.getTitle();
        System.out.println("currentTitle " + currentTitles);


        driver.manage().window().maximize();
         //navigate().to() is loading the url in the browser
        driver.navigate().to("https://www.google.com");

        //navigate().back()
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);
        //get current url and store

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL " + currentURL);

        driver.navigate().to("https://www.google.com");
        //String currentTit = driver.getTitle();
        System.out.println("currentTitle " + currentTitles);


        //get title - gives title of webpage


        driver.navigate().to("https://www.google.com");
        driver.getTitle();




        driver.quit();











    }


}
