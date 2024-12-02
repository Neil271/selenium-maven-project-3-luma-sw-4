package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.CommonMenuPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class WomenTest extends TestBase {

    //Create global object of class
    HomePage homePage = new HomePage();
    CommonMenuPage menuPage = new CommonMenuPage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    /*===============================================================*/
    public void verifyText(String actualText, String expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }

    public void verifyText(List<String> actualText, List<String> expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }
    /*===============================================================*/


    @Test
    public void verifyTheSortByProductNameFilter() {

        //Click on the consent button
        homePage.clickOnCookies();

        //* Mouse Hover on the ‘Women’ Menu
        menuPage.mouseHoverOnWomenMenu();

        //Mouse Hover on the ‘Tops’
        menuPage.mouseHoverOnTops();

        //* Click on the ‘Jackets’
        menuPage.clickOnJacketsTab();


        //* Get product names before performing any action in the jackets page
        List<String> productsNamesBefore = womenJacketsPage.getProductsNames();
        Collections.sort(productsNamesBefore);


        //* Select Sort By filter “Product Name”
        womenJacketsPage.selectFilter("Product Name");

        //* Verify the product name displayed in alphabetical order
        List<String> productNamesAfter = womenJacketsPage.getProductsNames();
        //System.out.println(productNamesAfter);
        verifyText(productNamesAfter, productsNamesBefore, "Products are not in an alphabetical order");

    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //Click on the consent button
        homePage.clickOnCookies();

        //* Mouse Hover on the ‘Women’ Menu
        menuPage.mouseHoverOnWomenMenu();

        //Mouse Hover on the ‘Tops’
        menuPage.mouseHoverOnTops();

        //* Click on the ‘Jackets’
        menuPage.clickOnJacketsTab();

        //* Get product price before performing any action in the jackets page
        List<String> productsPriceBefore = womenJacketsPage.getProductsPrice();
        Collections.sort(productsPriceBefore);

        //* Select Sort By filter “Product Price”
        womenJacketsPage.selectFilter("Price");

        //* Verify the product price displayed in Low to High
        List<String> productsPriceAfter = womenJacketsPage.getProductsPrice();
        //System.out.println(productsPriceAfter);
        verifyText(productsPriceAfter, productsPriceBefore, "Products price are not displayed in Low to High");

    }

}
