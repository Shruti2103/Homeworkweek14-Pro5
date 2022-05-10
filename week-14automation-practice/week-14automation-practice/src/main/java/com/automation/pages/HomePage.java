package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womantopMenu;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesTopMenu;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtsTopMenu;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signinclick;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logolocators;

    public void locatorsofLogo() {
        Reporter.log("Clicking on logo locators "+ logolocators.toString()+ "<br>");
        clickOnElement(logolocators);
    }

    public void clickonSigninButton() {
        Reporter.log("Clicking on sign in click"+ signinclick.toString()+ "<br>");
        clickOnElement(signinclick);
    }


    public void clickonTopMenuWoman() {
        Reporter.log("Clicking on woman top Menu"+ womantopMenu.toString()+ "<br>");
        clickOnElement(womantopMenu);
    }

    public void clickonDressesTopMenu() {
        Reporter.log("Clicking on news letter box"+ dressesTopMenu.toString()+ "<br>");
        clickOnElement(dressesTopMenu);
    }

    public void clickonTshirtsTopMenu() {
        Reporter.log("Clicking on tshirts Top Menu"+ tshirtsTopMenu.toString()+ "<br>");
        clickOnElement(tshirtsTopMenu);
    }


}
