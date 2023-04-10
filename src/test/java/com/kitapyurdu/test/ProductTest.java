package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//a[.='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[4]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[5]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[4]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11682843/wh:d8e078ec3']"));
        methods.waitBySeconds(5);
    }
}
