package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsersTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    ViewSystemUserPage viewSystemUserPage;
    AddUserPage addUserPage;

    @BeforeMethod
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        viewSystemUserPage = new ViewSystemUserPage();
        addUserPage = new AddUserPage();

    }
    @Test(groups = {"sanity","smoke"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEnterusername("Admin");
        loginPage.setEnterpassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.setAdmin();
        softAssert.assertEquals(viewSystemUserPage.verifySystemUserText(),"System Users","");
        softAssert.assertAll();
        viewSystemUserPage.setAddbutton();
        softAssert.assertEquals(addUserPage.verifyAddUsertText(),"Add User","");
        addUserPage.setUserrole("Admin");
        addUserPage.setEmployeename("Ananya Dash");
        addUserPage.setUsername("sample");
        Thread.sleep(1000);
        addUserPage.setStatus("Disabled");
        addUserPage.setPassword("admin123");
        addUserPage.setConfirmpassword("admin123");
        addUserPage.clickonSaveButton();


    }
    @Test(groups = {"smoke","regration"})
    public void searchTheUserCreatedAndVerifyIt(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEnterusername("Admin");
        loginPage.setEnterpassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.setAdmin();
        softAssert.assertEquals(viewSystemUserPage.verifySystemUserText(),"System Users","");
        softAssert.assertAll();

        viewSystemUserPage.setUserrole("Admin");
        viewSystemUserPage.setUsername("sample");
        viewSystemUserPage.setEmployeename("Aparna Dash");
        viewSystemUserPage.setStatus("Disabled");
        viewSystemUserPage.setSearch();

    }
    @Test(groups = {"regration"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEnterusername("Admin");
        loginPage.setEnterpassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.setAdmin();
        softAssert.assertEquals(viewSystemUserPage.verifySystemUserText(),"System Users","");
        softAssert.assertAll();
        viewSystemUserPage.setSearch();
        viewSystemUserPage.setUserrole("Admin");
        viewSystemUserPage.setUsername("sample");
        viewSystemUserPage.setEmployeename("David.Morris");
        viewSystemUserPage.setStatus("Enabled");

        viewSystemUserPage.setCheckboxButton();
        viewSystemUserPage.setDeletebutton();
        viewSystemUserPage.clickOnPopUp();

    }
@Test(groups = {"regration"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
    SoftAssert softAssert = new SoftAssert();
    loginPage.setEnterusername("Admin");
    loginPage.setEnterpassword("admin123");
    loginPage.clickOnLoginButton();
    homePage.setAdmin();
    softAssert.assertEquals(viewSystemUserPage.verifySystemUserText(),"System Users","");
    softAssert.assertAll();
    viewSystemUserPage.setUserrole("Admin");
    viewSystemUserPage.setUsername("sample");
    viewSystemUserPage.setStatus("Enabled");
    viewSystemUserPage.setSearch();
    softAssert.assertEquals(viewSystemUserPage.verifyUserNotFound(),"No Records Found","");

}
}
