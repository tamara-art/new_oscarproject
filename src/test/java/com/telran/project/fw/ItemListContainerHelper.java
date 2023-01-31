package com.telran.project.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemListContainerHelper extends BaseHelper{

    public static final String ID_TOP_PAGE_DIV_DIV_UL_LI_1_A = "//*[@id=\"top_page\"]/div/div/ul/li[1]/a";

    public ItemListContainerHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isContainerPresent() {
        return elementIsPresent(By.id("top_page"));
    }
    public boolean userNameIsPresent() {
//        return elementIsPresent(By.id("top_page"));
        return elementIsPresent(By.xpath(ID_TOP_PAGE_DIV_DIV_UL_LI_1_A));
    }
}
