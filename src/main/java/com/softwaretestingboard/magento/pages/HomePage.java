package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    // find the locator of accept cookies
    By cookies=By.xpath("//p[contains(text(),'Consent')]");

    /**
     * This method will accept the cookies.
     * */
    public void clickOnCookies(){
        clickOnElement(cookies);
    }
}
