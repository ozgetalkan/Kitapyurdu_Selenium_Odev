package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class RatingTest extends BaseTest {
    @Test
    public void ratingTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11682843/wh:d8e078ec3']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='lvl1catalog']/a[.='Puan Kataloğu']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:4359433/wh:14a4e2d16']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//div[@class='sort']/select[1]"),"Yüksek Oylama");
        methods.waitBySeconds(2);

    }
}
