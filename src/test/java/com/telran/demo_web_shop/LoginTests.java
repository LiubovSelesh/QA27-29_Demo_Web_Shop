package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLogOutButtonPresent()) {
            click(By.xpath("//a[contains(text(),'Log out')]"));
        }
}

    @Test
    public void loginUserPositiveTests() {
        login();
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'maxmiller@gmail.com')]")));

    }

    @Test
    public void loginUserNegativeTestsWrongPassword() {
        loginWrongPassword();
        Assert.assertTrue(isElementPresent(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")));

    }

    @Test
    public void loginUserNegativeTestsWrongEmail() {
        loginWrongEmail();
        Assert.assertTrue(isElementPresent(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")));

    }

}
