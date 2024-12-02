package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    /*
     *This method will click on overnight Duffle bag
     * */
    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }
}
