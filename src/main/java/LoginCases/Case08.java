package LoginCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case08 {
    public static void case08(WebDriver driver) {
        System.out.println("Test: Case08");

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        caseEmptyFields(driver);
        caseEmailField(driver);
        casePasswordField(driver);

    }

    private static void casePasswordField(WebDriver driver) {

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("test4555@hotmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("password") || result.contains("error")) {
            System.out.println("Case08 Password Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void caseEmailField(WebDriver driver) {

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("email") || result.contains("error")) {
            System.out.println("Case08 Email Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void caseEmptyFields(WebDriver driver) {

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("email") || result.contains("error")) {
            System.out.println("Case08 Empty Fields: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }

    }
}
