package CheckoutCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case15andCase16 {

    public static void case15(WebDriver driver) {

        System.out.println("Test: Case15");
        Case14.case14(driver);

        WebElement initialQuantityPlus = driver.findElement(By.className("cart_quantity_input"));

        WebElement add = driver.findElement(By.className("icon-plus"));
        add.click();

        driver.findElement(By.id("cart_title"));
        driver.findElement(By.id("order_step"));
        driver.findElement(By.id("cart_summary"));

        WebElement finalQuantityPlus = driver.findElement(By.className("cart_quantity_input"));

        if (initialQuantityPlus.getText().compareTo(finalQuantityPlus.getText()) != 0) throw new AssertionError();
    }

    public static void case16(WebDriver driver) {
        System.out.println("Test: Case16");

        WebElement initialQuantityMinus = driver.findElement(By.className("cart_quantity_input"));
        WebElement minus = driver.findElement(By.className("icon-minus"));
        minus.click();

        driver.findElement(By.id("cart_title"));
        driver.findElement(By.id("order_step"));
        driver.findElement(By.id("cart_summary"));

        WebElement finalQuantityMinus = driver.findElement(By.className("cart_quantity_input"));

        if (initialQuantityMinus.getText().compareTo(finalQuantityMinus.getText()) != 0) throw new AssertionError();
    }
}
