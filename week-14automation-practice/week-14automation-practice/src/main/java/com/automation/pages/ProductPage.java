package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement clearQty;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement addQty;
    WebElement size;
    @FindBy(xpath = "//label[contains(text(),'Color')]")
    WebElement colour;
    @FindBy(xpath = "//div[@class='product-container']")
    WebElement product;
    //   @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]")
//    WebElement quantitychange;//click add quantity + Plus sign click
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addtoCart;
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;
    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement closepopup;
    //------------------------------------------------------------------------
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

    //_--------------------------------------
    public void productclick() {
        Reporter.log("Clicking on product "+ product.toString()+ "<br>");
        clickOnElement(product);
    }

    public void makeclearQty() {
        Reporter.log("Clicking on clear Qty "+ clearQty.toString()+ "<br>");
        clearquantity(clearQty);
    }

    public void setAddQuantity(String text) {
        Reporter.log("Enter text "+text+ " to email field "+addQty.toString() + "<br>");
        sendTextToElement(addQty, text);
    }

    public void setSize(String text) {
        Reporter.log("Selecting text "+text+" from dropdown "+size.toString() + "<br>");
        selectByVisibleTextFromDropDown(size, text);
    }

    public void setcolour() {
        Reporter.log("Clicking on colour "+ colour.toString()+ "<br>");
        clickOnElement(colour);
    }

    public void clckonAddtoCart() {
        Reporter.log("Clicking on addtoCart "+ addtoCart.toString()+ "<br>");
        clickOnElement(addtoCart);
    }

    public String setPopUpDisplay() {
        Reporter.log("getting signout popUp Display  "+popUpDisplay.toString()+"<br>");
        return getTextFromElement(popUpDisplay);
    }

    public void setClosepopup() {
        Reporter.log("Clicking on closepopup "+ closepopup.toString()+ "<br>");
        clickOnElement(closepopup);
    }

    //---------------------------------------
    public void setColour(String text) {
        if (text == "White") {
            Reporter.log("Selecting White Colour " + whiteColour.toString());
            Reporter.log("Clicking on whiteColour "+ whiteColour.toString()+ "<br>");
            clickOnElement(whiteColour);
        }
        if (text == "Orange") {
            Reporter.log("Selecting Orange Colour " + orangeColour.toString());
            Reporter.log("Clicking on orangeColour "+ orangeColour.toString()+ "<br>");
            clickOnElement(orangeColour);
        }
        if (text == "Green") {
            Reporter.log("Selecting Green Colour " + greenColour.toString());
            Reporter.log("Clicking on greenColour "+ greenColour.toString()+ "<br>");
            clickOnElement(greenColour);
        }
        if (text == "Blue") {
            Reporter.log("Selecting Blue Colour " + blueColour.toString());
            Reporter.log("Clicking on blueColour "+ blueColour.toString()+ "<br>");
            clickOnElement(blueColour);
        }
    }

    //------------------------------------------
    public void selectProduct(String text) {
        if (text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouse.toString());
            Reporter.log("Clicking on blouse "+ blouse.toString()+ "<br>");
            clickOnElement(blouse);
        }

        if (text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString());
            Reporter.log("Clicking on printedDress "+ printedDress.toString()+ "<br>");
            clickOnElement(printedDress);
        }
        if (text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + chiffonPrintedDress.toString());
            Reporter.log("Clicking on chiffon PrintedDress "+ chiffonPrintedDress.toString()+ "<br>");
            clickOnElement(chiffonPrintedDress);
        }
        if (text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + summerDress.toString());
            Reporter.log("Clicking on summer Dress "+ summerDress.toString()+ "<br>");
            clickOnElement(summerDress);
        }
    }
}












