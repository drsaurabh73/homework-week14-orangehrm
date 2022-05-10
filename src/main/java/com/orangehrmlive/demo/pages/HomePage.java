package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // hrm logo
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement hrmlogo;
    // admin
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement admin;

    public void setAdmin() {
        clickOnElement(admin);
    }

    //PIM
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pim;
    //Leave
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leave;
    //Time
    @FindBy(xpath = "//b[contains(text(),'Time')]")
    WebElement time;
    //Dashboard
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboard;
    //welcome text
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcometext;

    public String verifyWelcomeMessage() {
        return getTextFromElement(welcometext);
    }
    //mouseHover on Logout and click
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;

    public void clickOnWelcome() {
        Reporter.log("Clicking on newsletterbox"+ welcometext.toString()+ "<br>");
        clickOnElement(welcometext);
    }
    public void setLogout(){
        Reporter.log("Clicking on Logout"+ logout.toString()+ "<br>");
        mouseHoverToElement(logout);
    }
    public void clickOnLogout() {
        Reporter.log("Clicking on newsletterbox"+ logout.toString()+ "<br>");
        clickOnElement(logout);
    }

}
