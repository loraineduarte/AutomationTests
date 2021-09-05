package CartCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case10 {
    public static void case10(WebDriver driver) {
        System.out.println("Test: Case10");

        testWomanPage(driver);
        testTShirtsPage(driver);
    }

    private static void testTShirtsPage(WebDriver driver) {
        WebElement submitLogin = driver.findElement(By.partialLinkText("T-shirts"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.id("image-block"));
        driver.findElement(By.id("product_reference"));

        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
    }

    private static void testDressesPage(WebDriver driver) {
        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();

        WebElement submitLogin = driver.findElement(By.partialLinkText("Dresses"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("navigation_page"));
        driver.findElement(By.className("content_scene_cat"));
        driver.findElement(By.id("subcategories"));

    }

    private static void testWomanPage(WebDriver driver) {
        WebElement submitLogin = driver.findElement(By.partialLinkText("Women"));
        submitLogin.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.className("navigation_page"));
        driver.findElement(By.className("content_scene_cat"));
        driver.findElement(By.id("subcategories"));

        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();

    }
}
