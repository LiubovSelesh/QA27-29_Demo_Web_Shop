package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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


    public void isRegistrationPresent() {
        int i = (int) ((System.currentTimeMillis()) / 1000) % 3600;
        click(By.xpath("//a[contains(text(),'Register')]"));
        type(By.xpath("//input[@id='FirstName']"), "Max");
        type(By.xpath("//input[@id='LastName']"), "Miller");
        type(By.xpath("//input[@id='Email']"), "maxmiller" + i + "@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Max7654321$");
        type(By.xpath("//input[@id='ConfirmPassword']"), "Max7654321$");
        click(By.cssSelector("#register-button"));
        click(By.cssSelector(".button-1.register-continue-button"));

    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void login() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "maxmiller@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Max7654321$");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Register')]"));
    }



    public void loginWrongPssword() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "maxmiller@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Ss7654321");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    public void loginWrongEmail() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
        type(By.xpath("//input[@id='Email']"), "@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Max7654321$");
        click(By.xpath("//input[@id='RememberMe']"));
        click(By.cssSelector(".button-1.login-button"));
    }

    @AfterMethod(enabled = false)
//    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void selectCountry(String country) {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
        select.selectByVisibleText(country);
    }

    public void selectMonth(String month) {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='ExpireMonth']")));
        select.selectByVisibleText(month);
    }
    public void selectYear(String year) {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='ExpireYear']")));
        select.selectByVisibleText(year);
    }

    public void selectCreditCard(String card) {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='CreditCardType']")));
//        select.selectByVisibleText(card);
        select.selectByValue(card);
    }

    public void clickWithAction(By Confirm) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(Confirm);

        actions.moveToElement(element).perform();
        element.click();
    }
}

