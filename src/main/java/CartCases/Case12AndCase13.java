package CartCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Case12AndCase13 {
    public static void case12(WebDriver driver) {
        System.out.println("Test: Case12");

        WebElement moreButton = driver.findElement(By.partialLinkText("More"));
        moreButton.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.id("image-block"));
        driver.findElement(By.id("product_reference"));

        testQuantityField(driver);
        testPlusButton(driver);
        testMinusButton(driver);
        testSizeDropDown(driver);

        submitProducts(driver);

        WebElement cartQuantity = driver.findElement(By.className("ajax_cart_quantity"));
        assert cartQuantity.getText().equals("4");
    }

    private static void submitProducts(WebDriver driver) {
        WebElement addToCartButton = driver.findElement(By.name("Submit"));
        addToCartButton.click();

        driver.findElement(By.id("layer_cart"));
        driver.findElement(By.className("continue"));
        driver.findElement(By.partialLinkText("checkout"));

        WebElement close = driver.findElement(By.className("cross"));
        close.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.id("image-block"));
        driver.findElement(By.id("product_reference"));
    }

    private static void testSizeDropDown(WebDriver driver) {
        System.out.println("Case12 Test Size");
        WebElement iconSize = driver.findElement(By.name("group_1"));
        iconSize.click();
        iconSize.sendKeys("M");
        iconSize.click();

        assert iconSize.getText().equals("M");

    }

    private static void testMinusButton(WebDriver driver) {
        System.out.println("Case12 Test Minus Button");
        WebElement iconMinus = driver.findElement(By.className("icon-minus"));
        iconMinus.click();

        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        assert quantity.getText().equals("3");
    }

    private static void testPlusButton(WebDriver driver) {
        System.out.println("Case12 Test Plus Button");
        WebElement iconPlus = driver.findElement(By.className("icon-plus"));
        iconPlus.click();

        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        assert quantity.getText().equals("4");

    }

    private static void testQuantityField(WebDriver driver) {
        System.out.println("Case12 Quantity Field");
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.clear();
        quantity.sendKeys("3");

        assert quantity.getText().equals("3");


    }
}
