package LoginWithoutAccountCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case03 {
    public static void case03(WebDriver driver) {
        System.out.println("Test: Case03");
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.id("create-account_form"));
        driver.findElement(By.id("login_form"));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("teste@hotmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("11223344");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("invalid") || result.contains("failed")) {
            System.out.println("Case03: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }
}
