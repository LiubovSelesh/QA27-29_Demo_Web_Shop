package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartProduct extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {

            login();
    }

    @Test
    public void addToCartProductPositiveTests() {
        click(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
        click(By.cssSelector("#products-orderby"));
        click(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));
        click(By.xpath("//span[contains(text(),'Shopping cart')]"));
        click(By.xpath("//input[@id='termsofservice']"));
        click(By.cssSelector("#checkout"));
        click(By.xpath("//select[@id='BillingNewAddress_CountryId']"));


        WebElement country = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select select = new Select(country);
        select.selectByVisibleText("United States");
        click(By.xpath("//select[@id='BillingNewAddress_CountryId']"));

        click(By.cssSelector("#BillingNewAddress_City"));
        type(By.xpath("//input[@id='BillingNewAddress_City']"), "Berlin");
        type(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Treptow");
        type(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "123786");
        typeWithInt(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), 123213213);

//        click(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"));
//        select();


    }

//    public void select() {
//        click(By.cssSelector("#BillingNewAddress_City"));
//        type(By.xpath("//input[@id='BillingNewAddress_City']"), "Berlin");
//        type(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Treptow");
//        type(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "123456");
//        type(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "49 147 83 45 56");
//
//        click(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"));
////        click(By.cssSelector(".button-1.login-button"));
//    }



}
//    public void click(By locator) {
//        driver.findElement(locator).click();
//    }


//    public void type(By locator, String text) {
//        click(locator);
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(text);
//    }
//
//
//    public void login() {
//        click(By.xpath("//a[contains(text(),'Log in')]"));
//        type(By.xpath("//input[@id='Email']"), "sillert@gmail.com");
//        type(By.xpath("//input[@id='Password']"), "Ss7654321$");
//        click(By.xpath("//input[@id='RememberMe']"));
//        click(By.cssSelector(".button-1.login-button"));
//    }

