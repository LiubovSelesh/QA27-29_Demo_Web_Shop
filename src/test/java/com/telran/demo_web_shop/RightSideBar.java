package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightSideBar extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLogOutButtonPresent()) {
            click(By.xpath("//a[contains(text(),'Log out')]"));
        }
    }

    @Test
    public void subscribePositiveTest() {
        login();
        isSubscribe();
        Assert.assertTrue(isElementPresent(By.cssSelector("#newsletter-result-block")));

    }

    @Test
    public void subscribeNegativeTest() {
        login();
        isSubscribeWithWrongEmail();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='newsletter-result-block']")));
    }

    @Test
    public  void communityPoolPositiveTests() {
        login();
        if (isElementPresent(By.cssSelector(".poll-options"))) {
            nopCommerceVoting();
            Assert.assertTrue(isElementPresent(By.cssSelector("#poll-block-1")));
        }
    }


    @Test
    public  void communityPoolNegativeTests() {
//        login();
        nopCommerceVoting();
        Assert.assertTrue(isElementPresent(By.cssSelector("#newsletter-result-block")));
    }

    @AfterMethod(enabled = false)
//    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
