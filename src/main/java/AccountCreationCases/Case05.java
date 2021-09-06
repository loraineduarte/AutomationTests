package AccountCreationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case05 {
    public static void case05(WebDriver driver) {
        System.out.println("Test: Case05");
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.id("create-account_form"));
        driver.findElement(By.id("login_form"));
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("teste112233@hotmail.com");
        WebElement submitLogin = driver.findElement(By.id("SubmitCreate"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.className("std"));


        Case06.case06(driver);
    }
}
