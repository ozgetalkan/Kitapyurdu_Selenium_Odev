
package com.kitapyurdu.driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.out.println("Selenium Egitimi");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe"); //.exe olmalı for windows

        ChromeOptions chromeOptions = new ChromeOptions(); //chorome'a açılma parametleri vereceğimiz nesneyi oluşturduk.
        chromeOptions.addArguments("disable-translate"); //translate'i açma
        chromeOptions.addArguments("disable-popup-blocking"); //popupları kapat
        chromeOptions.addArguments("--disable-notifications"); //bildirimleri gösterme

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "chrome 11");
        caps.setCapability("os","Windows");
        chromeOptions.merge(caps);

        driver = new ChromeDriver(chromeOptions); //driver'ın chrome olduğunu söyledik.
        driver.manage().window().maximize(); //chrome penceresini max boyutta açma.
        driver.get("https://www.kitapyurdu.com/"); //driver'a gitmesi gerekn adresi veriyorum.

        String pageTitle = driver.getTitle();
        String browser = (String) caps.getCapability("browser");
        String os = (String)  caps.getCapability("os");

        System.out.println("Page Title = " + pageTitle);
        System.out.println("Browser = " + browser);
        System.out.println("os = " + os);

    }
    @After
    public void tearDown(){
        if(driver != null){
            driver.close(); //tagları kapatır.
            driver.quit(); //driverı kapatır.
        }
    }

}
