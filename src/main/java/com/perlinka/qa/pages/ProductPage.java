package com.perlinka.qa.pages;

import com.perlinka.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Vector;

public class ProductPage extends TestBase {

    //Page Factory -- object repository
    @FindBy(css = "span[class ='item-details__new-price']" )
    List<WebElement> newPrices;

    //initializing the Page Objects:
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }

    //Methods
    public Vector<Boolean> checkNewPriceVisibility() {

        Vector<Boolean> vector = new Vector<Boolean>(newPrices.size());

        for (WebElement price: newPrices)
        {
            vector.add(price.isDisplayed());
            System.out.println(price.findElement(By.tagName("b")).getText());
        }

        return vector;


    }



}
