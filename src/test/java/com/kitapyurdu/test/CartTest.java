package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class CartTest extends BaseTest {
    @Test
    public void cartTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[1]/div[2]/h4"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/div[2]/div[2]/div/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//input[@name='quantity']"));
        methods.waitBySeconds(3);
        driver.findElement(By.xpath("//tbody//tr//td[@class='quantity']//input")).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "6");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='right']/a[contains(.,'Satın Al')]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-firstname-companyname']"), "Ozge");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-lastname-title']"), "Alkan");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "TUZLA");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='district']"), "AYDINTEPE MAH");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//textarea[@id='address-address-text']"), "Evora e parsel e4 blok daire 55");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-mobile-telephone']"), "5465889624");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"), "Özge Alkan");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//table[@class='form']//tr[5]//input[1]"), "4444");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[2]"), "3333");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[3]"), "1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[4]"), "2222");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//table[@class='form']//tr[5]//input[1]"), "4444");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "01");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2023");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='credit-card-security-code']"), "125");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//b[.='özge alkan']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        methods.waitBySeconds(2);
    }
}
