package com.juaracoding.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\bootcamp juara koding\\chromedriver_win32\\chromedriver.exe");

//        WebDriverManager.chromedriver().setup();

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://demoqa.com/text-box";

        driver.get(url);

        String titleName = driver.getTitle();
        System.out.println(titleName);

        JavascriptExecutor js = (JavascriptExecutor) driver;



        WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
        userName.sendKeys("JuaraCoding"); //sendKeys("JuaraCoding")

        System.out.println("input username");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        System.out.println("input user email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        System.out.println("input current address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        System.out.println("input permanent address");

        // scroll vertical 1000 pixel
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("submit")).click();
        System.out.println("button submit clicked");

        // delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}