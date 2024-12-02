package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.*;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GearTest extends TestBase {

    //Create global object of class
    HomePage homePage = new HomePage();
    CommonMenuPage menuPage = new CommonMenuPage();
    BagsPage bagsPage = new BagsPage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    /*===============================================================*/
    public void verifyText(String actualText, String expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }

    public void verifyText(List<String> actualText, List<String> expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }
    /*===============================================================*/


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        //Click on the consent button
        homePage.clickOnCookies();

        //Mouse Hover on the ‘Gear’ Menu
        menuPage.mouseHoverOnGearMenu();

        //Click on the ‘Bags’
        menuPage.clickOnBagsTab();

        //Click on Product Name ‘Overnight Duffle’
        bagsPage.clickOnOvernightDuffle();

        //Verify the text ‘Overnight Duffle’
        String expectProductName = "Overnight Duffle";
        String actualProductName = productDescriptionPage.getProductName();
        verifyText(actualProductName, expectProductName, "The text ‘Overnight Duffle’ is not displayed");

        //Change the Qty 3
        productDescriptionPage.changeProductQuantity("3");

        //Click on the ‘Add to Cart’ Button.
        productDescriptionPage.clickOnAddToCartButton();

        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualShoppingCartMessage = productDescriptionPage.getShoppingCartMessage();
        String expectedShoppingCartMessage = "You added Overnight Duffle to your shopping cart.";
        verifyText(actualShoppingCartMessage, expectedShoppingCartMessage, "The text You added Overnight Duffle to your shopping car is not displayed");

        //Click on the ‘shopping cart’ Link into message
        productDescriptionPage.clickOnShoppingCartClick();

        //Verify the product name ‘Overnight Duffle’
        String actualAddedProductName = shoppingCartPage.getProductName();
        String expectedAddedProductName = "Overnight Duffle";
        verifyText(actualAddedProductName, expectedAddedProductName, "The product name ‘Overnight Duffle is not displayed");

        //Verify the Qty is ‘3’
       /* String expectedQtyValue = "3";
        String actualQtyValue = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$45.00']"))).getText();
        System.out.println(actualQtyValue);
        Assert.assertEquals("The Qty is not 3.", expectedQtyValue, actualQtyValue);*/
        System.out.println(shoppingCartPage.getProductQty());

        //Verify the product price ‘$135.00’
        String actualPrice = shoppingCartPage.getPriceOfProduct();
        String expectedPrice = "$135.00";
        verifyText(actualPrice, expectedPrice, "The product price is not $135.00. ");

        //Change the Qty to ‘5’
        shoppingCartPage.changeQtyOfProduct("5");


        //Click on update Button
        shoppingCartPage.clickOnUpdateButton();

        //Verify the Product price '$225.00'
        Thread.sleep(3000);
        String actualUpdatedPrice = shoppingCartPage.getPriceOfProduct();
        String expectedUpdatedPrice = "$225.00";
        verifyText(actualUpdatedPrice, expectedUpdatedPrice, "The product price is not $225.00.");

    }


}
