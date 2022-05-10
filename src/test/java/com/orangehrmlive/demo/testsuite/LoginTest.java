package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    ViewSystemUserPage viewSystemUserPage;
    AddUserPage addUserPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        viewSystemUserPage = new ViewSystemUserPage();
        addUserPage = new AddUserPage();
    }
    @Test(groups = {"sanity","smoke","regration"})
    public void verifyUserShouldLoginSuccessFully() {

        SoftAssert softAssert = new SoftAssert();
        loginPage.setEnterusername("Admin");
        loginPage.setEnterpassword("admin123");
        loginPage.clickOnLoginButton();
        softAssert.assertEquals(homePage.verifyWelcomeMessage().substring(0,7),"WelCome","");
    }
@Test(groups = {"smoke","regration"})
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
    SoftAssert softAssert = new SoftAssert();
    loginPage.setEnterusername("Admin");
    loginPage.setEnterpassword("admin123");
    loginPage.clickOnLoginButton();
    homePage.clickOnWelcome();
    homePage.setLogout();

    homePage.clickOnLogout();

    softAssert.assertEquals(loginPage.verifyLoginPanel(),"LOGIN Panel","");
    softAssert.assertAll();

}
@Test(groups = {"smoke","regration"})
    public void verifyThatTheLogoDisplayOnHomePage() {
    SoftAssert softAssert = new SoftAssert();
    loginPage.setEnterusername("Admin");
    loginPage.setEnterpassword("admin123");
    loginPage.clickOnLoginButton();


}




}
