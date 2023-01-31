package com.telran.project.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationHelper extends BaseHelper {

    public RegistrationHelper(WebDriver webDriver) {
        super(webDriver);
    }
    public void enterEmail(String email) {
        type(By.id("id_registration-email"), email);
    }

    public void enterPassword(String pwd) {
        type(By.id("id_registration-password1"), pwd);
    }

//    public void confirmPassword(String pwd) {
//        type(By.id("id_registration-password2"), pwd);
//    }

    public void clickRegisterBtn() {
        click(By.cssSelector("button[name='registration_submit']"));
    }
}
