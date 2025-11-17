package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProductsTest extends BaseTest{
    @Test
    public void correctLogin(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpen();
        productsPage.addToCart(0);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        productsPage.switchToCart();
        assertTrue(cartPage.getProductsNames().contains("Test.allTheThings() T-Shirt (Red)"));
        assertEquals(cartPage.getProductsNames().size(), 2);
        assertFalse(cartPage.getProductsNames().isEmpty());
    }
}
