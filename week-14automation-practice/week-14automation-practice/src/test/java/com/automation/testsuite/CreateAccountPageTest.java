package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountPageTest extends TestBase {
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

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        //   signInPage.setSignout();
        homePage.clickonSigninButton();
        signInPage.emailidforcreateanAccount("nehamittal1@gmail.com");
        signInPage.clickoncreateanAccount();
        createAccountPage.radioBtnForGender();
        createAccountPage.setFirstName("neha");
        createAccountPage.setLastName("mital");
        //    createAccountPage.setEmailId("nehamittal@gmail.com");
        createAccountPage.setPassword("prime123");
        createAccountPage.setBirthdate("12");
        createAccountPage.setMonth("January");
        createAccountPage.setYear("1987");
        createAccountPage.setNewslettersignup();
        createAccountPage.setspecialOfferClick();
        createAccountPage.setAddressFirstName("neha");
        createAccountPage.setAddressLastNameName("mittal");
        createAccountPage.setCompanyName("Prime");
        createAccountPage.setAddressLine1("16");
        createAccountPage.setAddressLine2("Harrow");
        createAccountPage.setCityName("Harrow");
        createAccountPage.setStateNameName("London");
        createAccountPage.setZipcode("12345");
        createAccountPage.setCountryName("United States");
        createAccountPage.setAdditionalInformation("Hi");
        createAccountPage.setHomePhone("01245856589");
        createAccountPage.setMobilePhone("12547896325");
        createAccountPage.setassignaddress("My address");
        createAccountPage.clickRegisterButton();
        Assert.assertEquals(createAccountPage.myaccountTextvarify(), "My Account", "My account not displayed");


    }
}