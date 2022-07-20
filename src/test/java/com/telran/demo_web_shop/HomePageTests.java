package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomePageTests extends TestBase{

    @Test

    public void  openHomePageTests() {
        isElementPresent(By.cssSelector(".top-menu"));

    }

}
