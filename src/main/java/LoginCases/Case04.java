package LoginCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case04 {

    public static void case04(WebDriver driver) {
        System.out.println("Test: Case04");
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.id("create-account_form"));
        driver.findElement(By.id("login_form"));
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("teste4566hotmail.com");
        WebElement submitLogin = driver.findElement(By.id("SubmitCreate"));
        submitLogin.click();

        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("invalid") || result.contains("failed")) {
            System.out.println("Case04: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }
}
