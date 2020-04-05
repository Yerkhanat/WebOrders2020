package com.weborders.tests;

import com.weborders.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

   @Test
    public void verifyPageTitle(){
       LoginPage loginPage= new LoginPage();
       loginPage.login();


   }



}
