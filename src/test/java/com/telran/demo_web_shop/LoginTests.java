package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[contains(text(),'Register')]"))) {
            driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
        }
}
    @Test
    public void loginPositiveTests() {


    }
}
