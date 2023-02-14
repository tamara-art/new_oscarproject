package com.telran.project.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountHelper extends BaseHelper {
    public AccountHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickDeleteBtn() {
        click(By.cssSelector("#delete_profile"));
    }

    public void confirmPasswordToDeleteProfile(String pwd) {
        type(By.id("id_password"), pwd);
    }

    public boolean hasWarningMsg() {
        return elementIsPresent(By.cssSelector("#delete_profile_form > div.alert.alert-warning"));
    }

    public void clickDangerBtn() {
        click(By.cssSelector("#delete_profile_form > div:nth-child(4) > button"));
    }

    public boolean hasAllerInnerMsg() {
        return elementIsPresent(By.cssSelector("#messages > div > div"));
    }
}
