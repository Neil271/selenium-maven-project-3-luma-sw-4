package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class menPantsPage extends Utility {

    //Find the locator of cronusYogaPant
    By cronusYogaPant =By.linkText("Cronus Yoga Pant");

    /**
     * This method will do mouse hover and click on element
     * */
    public void mouseHoverAndClickOnCronusYogaPant(){
        mouseHoverToElementAndClick(cronusYogaPant);
    }
}
