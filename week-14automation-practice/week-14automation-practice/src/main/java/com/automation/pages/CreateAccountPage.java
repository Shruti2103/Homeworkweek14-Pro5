package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement radiobuttonGender;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateforBOD;
    @FindBy(id = "months")
    WebElement monthofBOD;
    @FindBy(id="years")
    WebElement yearofBDD;
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newslettersignup;
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialofferclick;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstName;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyName;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2;
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityName;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateName;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipcode;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryName;
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInformation;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futurerefranceaddress;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerBtnClick;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement varifyMyaccountText;

    public String myaccountTextvarify(){
        Reporter.log("getting varify Myaccount Text  from "+varifyMyaccountText.toString()+"<br>");
        return getTextFromElement(varifyMyaccountText);
    }
    public void setAddressFirstName(String firstName) {
        Reporter.log("Enter first Name "+firstName+ " to email field "+addressFirstName.toString() + "<br>");
        sendTextToElement(addressFirstName, firstName);
    }

    public void setAddressLastNameName(String lastName) {
        Reporter.log("Enter last Name "+lastName+ " to email field "+addressLastName.toString() + "<br>");
        sendTextToElement(addressLastName, lastName);
    }

    public void setNewslettersignup() {
        Reporter.log("Clicking on newsletter signup"+ newslettersignup.toString()+ "<br>");
        clickOnElement(newslettersignup);
    }

    public void setAddressLine1(String address1) {
        Reporter.log("Enter address "+address1+ " to email field "+addressLine1.toString() + "<br>");
        sendTextToElement(addressLine1, address1);
    }

    public void setAddressLine2(String address2) {
        Reporter.log("Enter address "+address2+ " to email field "+addressLine2.toString() + "<br>");
        sendTextToElement(addressLine2, address2);
    }

    public void setCityName(String city) {
        Reporter.log("Enter city "+city+ " to email field "+cityName.toString() + "<br>");
        sendTextToElement(cityName, city);
    }

    public void setStateNameName(String state) {
        Reporter.log("Selecting state "+state+" from dropdown "+stateName.toString() + "<br>");
        selectByVisibleTextFromDropDown(stateName, state);
    }

    public void setZipcode(String code) {
        Reporter.log("Enter code "+code+ " to email field "+zipcode.toString() + "<br>");
        sendTextToElement(zipcode, code);
    }

    public void setCountryName(String country) {
        Reporter.log("Selecting country "+country+" from dropdown "+countryName.toString() + "<br>");
        selectByVisibleTextFromDropDown(countryName, country);
    }

    public void setAdditionalInformation(String text) {
        Reporter.log("Enter additional Information "+text+ " to email field "+additionalInformation.toString() + "<br>");
        sendTextToElement(additionalInformation, text);
    }

    public void setHomePhone(String Phone) {
        Reporter.log("Enter Phone "+Phone+ " to email field "+homePhone.toString() + "<br>");
        sendTextToElement(homePhone, Phone);
    }

    public void setMobilePhone(String mPhone) {
        Reporter.log("Enter mP hone"+mPhone+ " to email field "+mobilePhone.toString() + "<br>");
        sendTextToElement(mobilePhone, mPhone);
    }

    public void setassignaddress(String assignaddress) {
        Reporter.log("Enter assign address "+assignaddress+ " to email field "+futurerefranceaddress.toString() + "<br>");
        sendTextToElement(futurerefranceaddress, assignaddress);
    }

    public void clickRegisterButton() {
        Reporter.log("Clicking on register Btn Click "+ registerBtnClick.toString()+ "<br>");
        clickOnElement(registerBtnClick);
    }


    public void setspecialOfferClick() {
        Reporter.log("Clicking on special offer click"+ specialofferclick.toString()+ "<br>");
        clickOnElement(specialofferclick);
    }

    public void setBirthdate(String date) {
        Reporter.log("selecting day"+date+dateforBOD.toString()+"<br>");
        selectByValueFromDropDown(dateforBOD, date);
    }

    public void setMonth(String month) {
        Reporter.log("selecting month"+month+monthofBOD.toString()+"<br>");
        selectByValueFromDropDown(monthofBOD, month);
    }

    public void setYear(String year) {
        Reporter.log("Selecting year "+year+" from dropdown "+yearofBDD.toString() + "<br>");
        selectByValueFromDropDown(yearofBDD, year);
    }

    public void setPassword(String password1) {
        Reporter.log("Enter password "+password1+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password, password1);
    }


    public void setFirstName(String fname) {
        Reporter.log("Enter email"+fname+ " to email field "+firstName.toString() + "<br>");
        sendTextToElement(firstName, fname);
    }

    public void setLastName(String lname) {
        Reporter.log("Enter last name "+lname+ " to email field "+lastName.toString() + "<br>");
        sendTextToElement(lastName, lname);
    }

    public void setEmailId(String email) {
        Reporter.log("Enter email "+email+ " to email field "+emailId.toString() + "<br>");
        sendTextToElement(emailId, email);
    }


    public void radioBtnForGender() {
        clickOnElement(radiobuttonGender);
    }
    public void setCompanyName(String text){
        Reporter.log("Enter text "+text+ " to email field "+companyName.toString() + "<br>");
        sendTextToElement(companyName,text);
    }

}
