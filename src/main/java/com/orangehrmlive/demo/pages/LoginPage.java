package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // username
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement enterusername;
    public void setEnterusername(String text) {
        Reporter.log("Enter username"+text+ " to email field "+enterusername.toString() + "<br>");
        sendTextToElement(enterusername,text);
    }
    // password
    @FindBy (xpath = "//input[@id='txtPassword']")
    WebElement enterpassword;
    public void setEnterpassword(String text) {
        Reporter.log("Enter email"+text+ " to email field "+enterpassword.toString() + "<br>");
        sendTextToElement(enterpassword,text);
    }
    // click login
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement login;
    public void clickOnLoginButton() {
        Reporter.log("Clicking on newsletterbox"+ login.toString()+ "<br>");
        clickOnElement(login);
    }
    // login panel
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginpanel;
public String verifyLoginPanel() {
    Reporter.log("getting Login Panel text from "+loginpanel.toString()+"<br>");
    return getTextFromElement(loginpanel);
}

}
