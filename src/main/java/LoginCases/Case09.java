package LoginCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case09 {
    public static void case09(WebDriver driver) {
        System.out.println("Test: Case09");

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test4555@hotmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("11223344");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.className("myaccount-link-list"));
    }
}
