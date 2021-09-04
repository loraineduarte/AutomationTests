package LoginCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case06 {
    public static void case06(WebDriver driver) {
        System.out.println("Test: Case06");
        Case05.case05(driver);

        //Testing fields
        //caseAllFieldsEmpty(driver);
        //caseFirstNameFieldError(driver);
        //caseLastNameFieldError(driver);
        casePasswordFieldError(driver);
    }

    private static void caseAllFieldsEmpty(WebDriver driver) {
        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("8") || result.contains("errors")) {
            System.out.println("Case06 All Fields Empty: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    private static void caseFirstNameFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        //customerFirstName.sendKeys(" ");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("firstname") || result.contains("error")) {
            System.out.println("Case06 First Name Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void caseLastNameFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        //customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("lastname") || result.contains("error")) {
            System.out.println("Case06 Last Name Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void casePasswordFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        //password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("password") || result.contains("error")) {
            System.out.println("Case06 Password Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }
}
