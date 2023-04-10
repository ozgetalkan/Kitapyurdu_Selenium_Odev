package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.HomePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTest extends BaseTest {
    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();
        homePage.home();
    }
}

   /* public static WebDriver driver;
    public static void main(String[] args){

        driver.findElement(By.xpath("//input[@id='search-input']")).click();

        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Edebiyat");

        driver.findElement(By.xpath("//span[@class='common-sprite button-search']")).click();

        driver.quit(); //driver. dendikten sonra metodları incele. */
