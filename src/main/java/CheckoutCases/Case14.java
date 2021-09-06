package CheckoutCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case14 {
    public static void case14(WebDriver driver) {

        System.out.println("Test: Case14");

        WebElement addToCartButton = driver.findElement(By.className("ajax_add_to_cart_button"));
        addToCartButton.click();

        driver.findElement(By.id("layer_cart"));
        driver.findElement(By.className("continue"));
        driver.findElement(By.partialLinkText("checkout"));

        WebElement checkout = driver.findElement(By.partialLinkText("Proceed to checkout"));
        checkout.click();

        driver.findElement(By.id("cart_title"));
        driver.findElement(By.id("order_step"));
        driver.findElement(By.id("cart_summary"));

    }
}
