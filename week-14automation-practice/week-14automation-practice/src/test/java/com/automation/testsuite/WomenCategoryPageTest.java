package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import com.automation.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();


    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        homePage.clickonSigninButton();
        homePage.clickonTopMenuWoman();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(womenCategoryPage.baseUrl, "Woman", "Woman text not display");

    }

    @Test(dataProvider = "productchoice", dataProviderClass = TestData.class,groups = {"sanity","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickonTopMenuWoman();
        Thread.sleep(2000);
        productPage.selectProduct(product);
        productPage.makeclearQty();
        productPage.setAddQuantity(qty);
        productPage.setSize(size);
        // productPage.setcolour(colour);
        Thread.sleep(2000);
        productPage.clckonAddtoCart();
        softAssert.assertEquals(productPage.setPopUpDisplay(), "Product successfully added to your shopping cart");
        productPage.setClosepopup();
    }


}