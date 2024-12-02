package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class CommonMenuPage extends Utility {

    //Find all locators of common Elements on every page
    By women=By.xpath("//a[@id='ui-id-4']");
    By tops=By.xpath("//a[@id='ui-id-9']");
    By jackets=By.xpath("//a[@id='ui-id-11']");
    By men = By.xpath("//a[@id='ui-id-5']");
    By bottoms=By.cssSelector("#ui-id-18");
    By pants=By.xpath("//a[@id='ui-id-23']");
    By gear=By.xpath("//span[normalize-space()='Gear']");
    By bags=By.id("ui-id-25");

    //*Mouse Hover on the 'Women' Menu
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(women);
    }

    //*Mouse Hover on the 'Men' Menu
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(men);
    }

    //*Mouse Hover on the 'Gear' Menu
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gear);
    }


    // * Mouse Hover on the ‘Tops’
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }

    // * Mouse Hover on the ‘Bottoms’
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }


    // * Click on the ‘Jackets’
    public void clickOnJacketsTab(){
        clickOnElement(jackets);
    }

    // * Click on the ‘Pants’
    public void clickOnPantsTab(){
        clickOnElement(pants);
    }

    // * Click on the ‘Bags’
    public void clickOnBagsTab(){
        clickOnElement(bags);
    }
}
