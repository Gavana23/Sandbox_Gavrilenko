package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FirstClass extends BaseTest {


     @Test
    public void zipCode(){
         loginPage.open();
         loginPage.login("12345");
        boolean registerButton = browser.findElement(By.xpath("//input[@value = 'Register']")).isDisplayed();
        assertTrue(registerButton, "Ожидалось наличие кнопки 'Register");
    }

     @Test
    public void zipDigitCode()  {
         WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
         loginPage.open();
         loginPage.login("12");
         assertEquals(loginPage.checkErrorMsg(), "Oops, error on page. ZIP code should have 5 digits");
    }


}

