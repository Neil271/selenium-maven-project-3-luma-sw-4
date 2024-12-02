package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.*;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MenTest extends TestBase {

    //Create global object of class
    HomePage homePage = new HomePage();
    CommonMenuPage menuPage = new CommonMenuPage();
    menPantsPage menPantsPage = new menPantsPage();
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
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //Click on the consent button
        homePage.clickOnCookies();

        //* Mouse Hover on the ‘Men’ Menu
        menuPage.mouseHoverOnMenMenu();

        //Mouse Hover on the ‘Bottoms’
        menuPage.mouseHoverOnBottoms();

        //* Click on the ‘Pants’
        menuPage.clickOnPantsTab();

        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the size 32.
        menPantsPage.mouseHoverAndClickOnCronusYogaPant();

        productDescriptionPage.clickOnPantSize();
        //menCronusYogaPantPage.clickOnPantSize();

        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        //menCronusYogaPantPage.clickOnColorBlack();
        productDescriptionPage.clickOnColorBlack();

        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the ‘Add To Cart’ Button.
        //menCronusYogaPantPage.clickOnAddToCartButton();
        productDescriptionPage.clickOnAddToCartButton();

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedShoppingCartMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualShoppingCartMessage = productDescriptionPage.getShoppingCartMessage();
        verifyText(actualShoppingCartMessage, expectedShoppingCartMessage, "Shopping Cart Message Not Displayed");

        //Click on the ‘shopping cart’ Link into message
        productDescriptionPage.clickOnShoppingCartClick();

        //Verify the text ‘Shopping Cart.’
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = shoppingCartPage.getShoppingCartText();
        verifyText(actualShoppingCartText, expectedShoppingCartText, "Shopping Cart text not displayed");

        //Verify the product size ‘32’
        String expectedSizeText = "32";
        String actualSizeText = shoppingCartPage.getProductSize();
        verifyText(actualSizeText, expectedSizeText, "the product size ‘32’ is not displayed");

        //Verify the product color ‘Black’
        String expectedColor = "Black";
        String actualColor = shoppingCartPage.getProductColor();
        verifyText(actualColor, expectedColor, "The product color black is not displayed");

    }

}
