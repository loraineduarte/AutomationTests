package AccountCreationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case07 {
    public static void case07(WebDriver driver) {
        System.out.println("Test: Case07");

        putDataOnFields(driver);
        logout(driver);
    }

    private static void logout(WebDriver driver) {
        WebElement logout = driver.findElement(By.className("logout"));
        logout.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    private static void putDataOnFields(WebDriver driver) {

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

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.className("myaccount-link-list"));

    }
}
