package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

      WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public boolean isElementPresent2(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void typeWithInt(By locator, int num) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys("123213213");

    }



    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void login() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "sillertttt@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Sstt7654321$");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Register')]"));
    }

    protected void isRegistrationPresent() {
        click(By.xpath("//a[contains(text(),'Register')]"));
        type(By.xpath("//input[@id='FirstName']"), "Saxtt");
        type(By.xpath("//input[@id='LastName']"), "Sillerttt");
        type(By.xpath("//input[@id='Email']"), "sillertttt@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Sstt7654321$");
        type(By.xpath("//input[@id='ConfirmPassword']"), "Sstt7654321$");
        click(By.cssSelector("#register-button"));
    }

    protected void loginWrongPssword() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "sillert@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Ss7654321");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    protected void loginWrongEmail() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "sil@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Ss7654321$");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    @AfterMethod(enabled = false)
//    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
