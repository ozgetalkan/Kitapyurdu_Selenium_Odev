package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){

        Methods methods = new Methods();
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "ozgetanulkuu@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "Ozge1360.");
        methods.waitBySeconds(1);
        //methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.click(By.xpath("//button[@type='submit']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[@class='section']")));
        methods.waitBySeconds(1);
    }

}
