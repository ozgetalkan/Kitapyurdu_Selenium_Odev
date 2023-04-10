
package com.kitapyurdu.page;
import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class LoginPage {
    Methods methods;
    public LoginPage(){ methods = new Methods();}
    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id='js-popup-accept-button']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "ozgetanulkuu@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "Ozge1360.");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//button[@type='submit']"));
        methods.waitBySeconds(10);
        //Google cache geçimi yapılması için bırakılan uzun süre.
    }
}
