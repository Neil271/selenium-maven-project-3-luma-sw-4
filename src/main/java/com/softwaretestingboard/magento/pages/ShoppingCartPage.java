package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ShoppingCartPage extends Utility {

    //Find the locators of Shopping Cart Page
    By shoppingCartText = By.xpath("//span[@class='base']");
    By productSize=By.xpath("//dd[contains(text(),'32')]");
    By colorBlack=By.xpath("//dd[contains(text(),'Black')]");
    By productName=By.xpath("//td[@class='col item']/div//a");
    By productPrice=By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By productQty=RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//td[@class='col price']//span[@class='price']"));
    By updateCartButton = By.xpath("//button[@title='Update Shopping Cart']");



    /**
     * This method will get the text of the shopping cart
     * */
    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    /**
     * This method will get the size of the product
     * */
    public String getProductSize() {
        return getTextFromElement(productSize);
    }

    /**
     * This method will get the colour of the product
     * */
    public String getProductColor() {
        return getTextFromElement(colorBlack);
    }

    /**
     * This method will get the name of the product
     * */
    public String getProductName(){
        return getTextFromElement(productName);
    }

    /**
     * This method will get the price of the product
     * */
    public String getPriceOfProduct(){
        return getTextFromElement(productPrice);
    }

    /**
     * This method will get the qty of the product
     * */
    public String getProductQty(){
        return getTextFromElement(productQty);
    }

    /**
     * This method will change the qty of the product
     * */
    public void changeQtyOfProduct(String qty){
        sendTextToElement(productQty,qty);
    }

    /**
     *This method will click on the UpdateCart Button
     * */
    public void clickOnUpdateButton(){
        clickOnElement(updateCartButton);
    }



}
