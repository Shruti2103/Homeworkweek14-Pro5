package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womanText;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dresseslink;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortby;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement listgridclick;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signoutvarify;
    //------------------------------------------------------


    public String varifysignout() {
        Reporter.log("getting signout varify     "+signoutvarify.toString()+"<br>");
        return getTextFromElement(signoutvarify);//-----------------Sign out after login ----
    }

    public String womangetTextvarify() {
        Reporter.log("getting woman Text   "+womanText.toString()+"<br>");
        return getTextFromElement(womanText);
    }

    public void clickOnTops() {
        Reporter.log("Clicking on dresses link "+ dresseslink.toString()+ "<br>");
        clickOnElement(dresseslink);
    }

    public void setsortby(String text) {
        Reporter.log("Selecting text "+text+" from dropdown "+sortby.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortby, text);
    }

    public void clickOnList() {
        Reporter.log("Clicking on listgridclick"+ listgridclick.toString()+ "<br>");
        clickOnElement(listgridclick);
    }

    //------------------------------------last step ---xpath for all test data
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;
    @FindBy(xpath = "//h1[contains(text(),'Printed Dress')]")
    WebElement printedDress;
    @FindBy(xpath = "//h1[contains(text(),'Printed Chiffon Dress')]")
    WebElement chiffonPrintedDress;
    @FindBy(xpath = "//h1[contains(text(),'Printed Summer Dress')]")
    WebElement summerDress;
    @FindBy(xpath = "//a[@name='White']")
    WebElement whiteColour;

    @FindBy(xpath = "//a[@name='Orange']")
    WebElement orangeColour;

    @FindBy(xpath = "//a[@name='Green']")
    WebElement greenColour;

    @FindBy(xpath = "//a[@name='Blue']")
    WebElement blueColour;

    public void setColour(String text) {
        if (text == "White") {

            Reporter.log("Clicking on whiteColour "+ whiteColour.toString()+ "<br>");
            clickOnElement(whiteColour);
        }
        if (text == "Orange") {

            Reporter.log("Clicking on orangeColour "+ orangeColour.toString()+ "<br>");
            clickOnElement(orangeColour);
        }
        if (text == "Green") {

            Reporter.log("Clicking on greenColour "+ greenColour.toString()+ "<br>");
            clickOnElement(greenColour);
        }
        if (text == "Blue") {

            Reporter.log("Clicking on blueColour "+ blueColour.toString()+ "<br>");
            clickOnElement(blueColour);
        }
    }

    //---------------------------------------------------
    public void selectProduct(String text) {
        if (text == "Blouse") {

            Reporter.log("Clicking on blouse "+ blouse.toString()+ "<br>");
            clickOnElement(blouse);
        }

        if (text == "Printed Dress") {

            Reporter.log("Clicking on printed Dress "+ printedDress.toString()+ "<br>");
            clickOnElement(printedDress);
        }
        if (text == "Printed Chiffon Dress") {

            Reporter.log("Clicking on chiffon PrintedDress "+ chiffonPrintedDress.toString()+ "<br>");
            clickOnElement(chiffonPrintedDress);
        }
        if (text == "Printed Summer Dress with Price $28.98") {

            Reporter.log("Clicking on summerDress "+ summerDress.toString()+ "<br>");
            clickOnElement(summerDress);
        }

    }

}





