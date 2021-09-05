package CartCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case11 {
    public static void case11(WebDriver driver) {
        System.out.println("Test: Case11");

        WebElement addToCartButton = driver.findElement(By.className("ajax_add_to_cart_button"));
        addToCartButton.click();

        driver.findElement(By.id("layer_cart"));
        driver.findElement(By.className("continue"));
        driver.findElement(By.partialLinkText("checkout"));

        WebElement close = driver.findElement(By.className("cross"));
        close.click();

        driver.findElement(By.className("shopping_cart"));
        WebElement quantity = driver.findElement(By.className("ajax_cart_quantity"));

        if(quantity.getText().equals("1")){
            System.out.println("Case11 Amount Test: correctly result");
        } else {
            System.out.println("Case11 Amount Test: Wrong result");
        }
    }
}
