package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[contains(text(),'Register')]"))) {
            driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
        }
    }

    @Test
    public void registrationPositiveTests() {

//        int i =
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
//        driver.findElement(By.cssSelector("[for='gender-male']")).click();
//        driver.findElement(By.cssSelector("[for='gender-male']")).clear();
//        driver.findElement(By.cssSelector("[for='gender-male']")).sendKeys("");

        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sax");

        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Siller");

        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("siller@gmail.com");

        driver.findElement(By.xpath("//input[@id='Password']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ss7654321#");

        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Ss7654321#");

        driver.findElement(By.cssSelector("#register-button")).click();

//        Assert.assertTrue(isElementPresent(By.cssSelector("//a[contains(text(),'Log out')]")));



    }
}
