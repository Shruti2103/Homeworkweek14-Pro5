package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import com.automation.testdata.TestData;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignPageTest extends TestBase {
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
    public void userShouldNavigateToSignInPageSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickonSigninButton();
        softAssert.assertEquals(signInPage.textAuthentification(), "AUTHENTICATION", "Authentification not displayed");
        softAssert.assertAll();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
        homePage.clickonSigninButton();
        SoftAssert softAssert = new SoftAssert();
        signInPage.loginToApplication(username, password);
        softAssert.assertEquals(signInPage.varifysignoutButton(), "Sign out", "User cant sign out");


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickonSigninButton();
        signInPage.enterEmailId("nehamittal@gmail.com");
        signInPage.enterPasswordId("prime123");
        signInPage.clickonSigninButton();
        softAssert.assertEquals(signInPage.varifysignoutButton(), "Sign out", "User cant navigate to Sign out");
        signInPage.setSignout();


    }

    @Test(groups = {"regression"})
    public void erifyThatUserShouldLogOutSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickonSigninButton();
        signInPage.enterEmailId("nehamittal@gmail.com");
        signInPage.enterPasswordId("prime123");
        signInPage.clickonSigninButton();
        signInPage.setSignout();
        softAssert.assertEquals(signInPage.varifysignoutButton(), "Sign out", "User cant navigate to Sign out");


    }


}
