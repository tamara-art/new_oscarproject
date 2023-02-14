package com.telran.project.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemCardHelper extends BaseHelper{
    public ItemCardHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnProductPicture() {
        click(By.cssSelector("#default > div > div > div > div > section > div > ol > " +
                "li:nth-child(1) > article > div.image_container.w-100 > a > img"));
    }

    public void clickOnProductTitle() {
        click(By.cssSelector("#default > div > div > div > div > section > div > ol > li:nth-child(1)" +
                " > article > h3 > a"));
    }

    public void clickOnProductAddToBasketBtn() {
        click(By.cssSelector("#default > div > div > div > div > section > div > ol > li:nth-child(1) > " +
                "article > div.product_price.w-100 > form > button"));
    }

}
