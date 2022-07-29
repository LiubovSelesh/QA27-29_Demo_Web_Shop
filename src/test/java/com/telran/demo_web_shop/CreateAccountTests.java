package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateAccountTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLogOutButtonPresent()) {
            click(By.xpath("//a[contains(text(),'Log out')]"));
        }
    }

    @Test
    public void registrationPositiveTests() {
        isRegistrationPresent();

        Assert.assertTrue(isElementPresent(By.cssSelector(".center-2")));
    }

}
