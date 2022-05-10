package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }
    // user management
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement usermanagement;
    //jobs
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobs;
    //organization
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organization;

}
