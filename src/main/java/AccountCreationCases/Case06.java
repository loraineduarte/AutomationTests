package AccountCreationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case06 {
    public static void case06(WebDriver driver) {
        System.out.println("Test: Case06");

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        //Atention - Change this everytime of the run to put a new person on the system
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("test4555@hotmail.com");
        WebElement submitLogin = driver.findElement(By.id("SubmitCreate"));
        submitLogin.click();

        //Testing fields
        caseAllFieldsEmpty(driver);
        caseCustomerFirstNameFieldError(driver);
        caseCustomerLastNameFieldError(driver);
        casePasswordFieldError(driver);
        caseAddressFieldError(driver);
        caseCityFieldError(driver);
        caseZipCodeFieldError(driver);
        casePhoneNumberFieldError(driver);
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

    private static void caseCustomerFirstNameFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
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

    private static void caseCustomerLastNameFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();
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
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();
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

    private static void caseAddressFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("address") || result.contains("error")) {
            System.out.println("Case06 Address Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void caseCityFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();
        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("city") || result.contains("error")) {
            System.out.println("Case06 City Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void caseZipCodeFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();
        mobile.sendKeys("889889889");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("zip") || result.contains("error")) {
            System.out.println("Case06 ZipCode Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

    private static void casePhoneNumberFieldError(WebDriver driver) {
        WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
        gender.click();
        WebElement customerFirstName = driver.findElement(By.id("customer_firstname"));
        customerFirstName.clear();
        customerFirstName.sendKeys("test");
        WebElement customerLastName = driver.findElement(By.id("customer_lastname"));
        customerLastName.clear();
        customerLastName.sendKeys("testtest");
        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();
        password.sendKeys("11223344");
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.clear();
        firstname.sendKeys("test");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("testtest");
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Street street 1234");
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Fundão");
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        state.sendKeys("Alabama");
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.clear();

        postcode.sendKeys("00000");
        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("21");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.clear();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement submitLogin = driver.findElement(By.id("submitAccount"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-danger"));
        WebElement searchResult = driver.findElement(By.className("alert-danger"));
        String result = searchResult.getText();
        result = result.toLowerCase();

        if(result.contains("phone") || result.contains("error")) {
            System.out.println("Case06 Phone Number Field: Error returned correctly");
        } else {
            System.out.println("Message of error is wrong");
        }
    }

}
