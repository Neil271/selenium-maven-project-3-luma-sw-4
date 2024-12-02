package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ProductDescriptionPage extends Utility {

    //find the locator of all elements in productDescription Page
    By productName=By.className("base");
    By productQuantity=By.id("qty");
    By pantsSize=By.xpath("//div[@id='option-label-size-143-item-175']");
    By colorBlack=By.xpath("//div[@id='option-label-color-93-item-49']");
    By addToCartButton=By.xpath("//button[@id='product-addtocart-button']");
    By shoppingCartMessage=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink=By.xpath("//a[normalize-space()='shopping cart']");


    /**
     * This method will get the text of the product
     * */
    public String getProductName(){
        return getTextFromElement(productName);
    }

    /**
     * This method will cjange the quantity of the product
     * */
    public void changeProductQuantity(String qty){
        sendTextToElement(productQuantity,qty);
    }

    /**
     * This method will click on add to cart element.
     * */
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    /**
     * This method will get the text of the Shopping cart Message.
     * */
    public String getShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }

    /**
     * This method will click on the shopping cart link in the message
     * */
    public void clickOnShoppingCartClick(){
        clickOnElement(shoppingCartLink);
    }

    /**
     * This method will get the size of the pants
     * */
    public void clickOnPantSize(){
        clickOnElement(pantsSize);
    }

    /**
     * This method will get the color of the product
     * */
    public void clickOnColorBlack(){
        clickOnElement(colorBlack);
    }



}
