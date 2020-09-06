package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopHomePage extends PageBaseShop {

       public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String EMAIL_INPUT_ID = "email";
    private final String PASS_INPUT_ID = "passwd";
    private final String BUTTON_SIGNIN_ID = "SubmitLogin";
    private final String TITLE_H1_CSS_selector = "#center_column > h1";
    private final String SLIDER_HOME_ID = "slider_row";

    public void go() {
        navigateToCompleteURL();
    }

    public void clickSignInButton(){
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));

    }

    public void completeLoginInfo(String email, String pass){
        completeField(By.id(EMAIL_INPUT_ID), email);
        completeField(By.id(PASS_INPUT_ID), pass);



    }
    public void clickSignInButton2(){
        clickElement(By.id(BUTTON_SIGNIN_ID));

    }

    public void verifyScreen(String pantalla) {
        Assert.assertTrue(isElementVisible(By.cssSelector(TITLE_H1_CSS_selector)), "no se encontró el titulo");
    }
    public void verifyHome(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(SLIDER_HOME_ID)), "el elemento no es visible");



        }


    }


