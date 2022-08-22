package com.telran.demo_web_shop;

import org.testng.annotations.BeforeMethod;

public class RemoveItemsFromShoppingCartTest extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        login();
    }
}
