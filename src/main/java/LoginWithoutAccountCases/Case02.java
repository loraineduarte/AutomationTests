package LoginWithoutAccountCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case02 {
    public static void case02(WebDriver driver) {
        System.out.println("Test: Case02");
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.id("create-account_form"));
        driver.findElement(By.id("login_form"));
        driver.findElement(By.id("email"));
        driver.findElement(By.id("passwd"));

        //Testing email field
        testEmailFieldCase1(driver);
        testEmailFieldCase2(driver);

        //Testing password field
        TestPasswordField(driver);

        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }


    private static void testEmailFieldCase1(WebDriver driver) {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("testehotmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("11223344");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("invalid") || result.contains("email") ) {
            System.out.println("Case02: Error returned correctly ");
        } else {
            System.out.println("Message of error is wrong ");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    private static void testEmailFieldCase2(WebDriver driver) {
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("teste@hotmail");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("invalid") || result.contains("email") ) {
            System.out.println("Case02: Error returned correctly ");
        } else {
            System.out.println("Message of error is wrong ");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    private static void TestPasswordField(WebDriver driver) {
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("teste@hotmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("112");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();
        driver.findElement(By.className("alert-danger"));

        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("invalid") || result.contains("failed")) {
            System.out.println("Case02: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }


}
