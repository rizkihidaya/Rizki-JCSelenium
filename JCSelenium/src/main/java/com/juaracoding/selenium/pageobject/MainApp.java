package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Alerts;
import com.juaracoding.selenium.pageobject.pages.WebTables;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

       // WebTables webTables = new WebTables();
        //webTables.registrationForm("Text 1", "Text 2", "text@email.com", "20", "20000", "SQA");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/alerts");
        Alerts alerts = new Alerts();
        alerts.alertButton();
        alerts.timerAlertButton();
        alerts.confirmButton();
        js.executeScript("window.scrollBy(0,300)");
        alerts.promtButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
