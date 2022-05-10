package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUserPage extends Utility {
    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }
    // system user text
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement systemusertext;
    public String verifySystemUserText() {
        return getTextFromElement(systemusertext);

    }
    // username
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement username;
    public void setUsername(String text){
        sendTextToElement(username,text);
    }
    // user role
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userrole;
    public void setUserrole(String text) {
        sendTextToElement(userrole,text);
    }
    // employee name
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeename;
    public void setEmployeename(String text) {
        sendTextToElement(employeename,text);
    }
    // status
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    public void setStatus(String text) {
        selectByVisibleTextFromDropDown(status,text);
    }
    // search
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement search;
    public void setSearch() {
        clickOnElement(search);
    }
    // Reset
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement reset;
    public void setReset(){
        clickOnElement(reset);
    }
    // add button
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addbutton;
    public void setAddbutton() {
        clickOnElement(addbutton);
    }
    // delete button
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletebutton;
    public void setDeletebutton()  {
        clickOnElement(deletebutton);
    }
@FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_17']")
    WebElement checkbox;
    public void setCheckboxButton(){
        clickOnElement(checkbox);
    }
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement clickok;
    public void clickOnPopUp() {
        clickOnElement(clickok);
    }
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement usernotFound;
    public String verifyUserNotFound() {
        return getTextFromElement(usernotFound);
    }






}
