package login;

import base.BaseTests1;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests1 {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.setUsername("tomsmıth");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginPage.clickLoginButton();


    }
}
