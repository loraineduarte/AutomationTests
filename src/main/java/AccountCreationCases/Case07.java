package AccountCreationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case07 {
    public static void case07(WebDriver driver) {
        System.out.println("Test: Case07");

        signIn(driver);
        putDataOnFields(driver);
        logout(driver);
    }

    private static void signIn(WebDriver driver) {

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        //Attention - Change this everytime of the run to put a new person on the system
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("test1111@hotmail.com");
        WebElement submitLogin = driver.findElement(By.id("SubmitCreate"));
        submitLogin.click();
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
        customerFirstName.sendKeys("test");
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

        driver.findElement(By.className("page-heading"));
        driver.findElement(By.className("myaccount-link-list"));

    }
}
