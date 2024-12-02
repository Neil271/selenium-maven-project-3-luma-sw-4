package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenJacketsPage extends Utility {
    //find the locator of WomenJackets Page.
    By dropDown=By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By productNames=By.xpath("//li//div[1]//div[1]//strong[1]/a");
    By productsPrice=By.xpath("//span[@class='price-wrapper ']");


    /**
     * This method will get the name of the products before doing any actions
     * */
    public List<String> getProductsNames(){
        List<WebElement> products =findElements(productNames);

        List<String> productNamesBefore = new ArrayList<>();
        for (WebElement product:products){
            productNamesBefore.add(product.getText());
        }
        return productNamesBefore;
    }


    /**
     * This method will get the name of the products before doing any actions
     * */
    public List<String> getProductsPrice(){
        List<WebElement> products =findElements(productsPrice);

        List<String> productsPriceBefore = new ArrayList<>();
        for (WebElement product:products){
            productsPriceBefore.add(product.getText());
        }
        return productsPriceBefore;
    }

    /**
     * This method will click on select dropdown element.
     * */
    public void selectFilter(String option){
        selectByVisibleTextFromDropDown(dropDown,option);
    }


}
