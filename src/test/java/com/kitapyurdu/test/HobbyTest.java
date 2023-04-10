package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class HobbyTest extends BaseTest {

@Test
    public void hobbyTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:62170/wi:100/wh:true']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//span[.='Sepete Ekle']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[@class='sprite sprite-icon-list']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11244290/wi:100/wh:true']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='product-list']/div[3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(2);


    }
}
