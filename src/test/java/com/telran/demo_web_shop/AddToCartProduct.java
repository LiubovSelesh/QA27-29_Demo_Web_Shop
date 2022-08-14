package com.telran.demo_web_shop;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartProduct extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        isRegistrationPresent();
//            login();
    }

    @Test
    public void addToCartProductPositiveTests() {
        click(By.cssSelector(".top-menu:nth-child(1) [href='/books']"));
        click(By.cssSelector("#products-orderby"));
        click(By.cssSelector(".item-box:nth-child(1) .product-box-add-to-cart-button"));

        click(By.xpath("//span[contains(text(),'Shopping cart')]"));
        click(By.xpath("//input[@id='termsofservice']"));
        click(By.cssSelector("#checkout"));
        click(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        selectCountry("United States");

        click(By.xpath("//select[@id='BillingNewAddress_CountryId']"));

        click(By.cssSelector("#BillingNewAddress_City"));
        type(By.xpath("//input[@id='BillingNewAddress_City']"), "Berlin");
        type(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Treptow");
        type(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "123786");
        type(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "1231245");
        click(By.xpath("//input[@onclick='Billing.save()']"));

        click(By.xpath("//input[@onclick='Shipping.save()']"));
        click(By.cssSelector("#shippingoption_1"));
        click(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        click(By.cssSelector("#paymentmethod_2"));
        click(By.xpath("//input[@onclick='PaymentMethod.save()']"));

        click(By.cssSelector("#CreditCardType"));
        selectCreditCard("MasterCard");
        click(By.xpath("//select[@id='CreditCardType']"));
        click(By.xpath("//input[@id='CardholderName']"));
        type(By.xpath("//input[@id='CardholderName']"), "Max");
        type(By.xpath("//input[@id='CardNumber']"), "5425233430109903");
        click(By.xpath("//select[@id='ExpireMonth']"));
        selectMonth("06");
        click(By.xpath("//select[@id='ExpireYear']"));
        selectYear("2025");
        type(By.xpath("//input[@id='CardCode']"), "123");
        click(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        click(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
//        click(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
//        clickWithAction(By.xpath("//input[@onclick='ConfirmOrder.save()']"));


    }


}





