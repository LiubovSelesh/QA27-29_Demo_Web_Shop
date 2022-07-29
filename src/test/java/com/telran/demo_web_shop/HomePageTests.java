package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test

    public void  openHomePageTests() {
        isElementPresent(By.cssSelector(".top-menu"));

    }

}
