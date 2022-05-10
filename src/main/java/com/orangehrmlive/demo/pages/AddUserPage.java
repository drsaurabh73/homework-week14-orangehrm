package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
    // verify Add user
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addusertext;
    public String verifyAddUsertText() {

        Reporter.log("getting verify add user text from "+addusertext.toString()+"<br>");
        return getTextFromElement(addusertext);
    }
   // user Role
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userrole;
    public void setUserrole(String text){
        Reporter.log("Selecting user role"+text+" from dropdown "+userrole.toString() + "<br>");
        selectByVisibleTextFromDropDown(userrole,text);
    }
    // employee name
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeename;
    public void setEmployeename(String text){
        Reporter.log("Enter Employee name"+text+ " to email field "+employeename.toString() + "<br>");
        sendTextToElement(employeename,text);
    }
        // username
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;
    public void setUsername(String text){
        Reporter.log("Enter username"+text+ " to email field "+username.toString() + "<br>");
        sendTextToElement(username,text);
    }
    //status
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement status;
    public void setStatus(String text) {
        Reporter.log("Selecting status"+text+" from dropdown "+status.toString() + "<br>");
        selectByVisibleTextFromDropDown(status,text);
    }
    // password
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    public void setPassword(String text) {
        Reporter.log("Enter password"+text+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,text);
    }
    // confirmpassword
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmpassword;
    public void setConfirmpassword(String text){
        Reporter.log("Enter confirm password"+text+ " to email field "+confirmpassword.toString() + "<br>");
        sendTextToElement(confirmpassword,text);
    }
    // save button
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement savebutton;
    public void clickonSaveButton() {
        Reporter.log("Clicking on save button"+ savebutton.toString()+ "<br>");
        clickOnElement(savebutton);
    }
    // cancel button
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelbutton;
    public void clickOnCancelButton(){
        Reporter.log("Clicking on cancel Button"+ cancelbutton.toString()+ "<br>");
        clickOnElement(cancelbutton);
    }
    // verify you can search = //tbody/tr[1]/td[2]
@FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement searchadded;
    public String verifyUserSearch() {
        Reporter.log("getting Verify user search text from "+searchadded.toString()+"<br>");
        return getTextFromElement(searchadded);
    }


}
