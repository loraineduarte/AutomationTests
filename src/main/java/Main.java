import LoginCases.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {
        //Passos a serem feitos antes de executar o projeto:
        //Baixar o ChromeDriver presente no link (https://chromedriver.chromium.org/downloads) de acordo com a versão do seu chrome
        //Colocar em algum local de fácil acesso
        //Mudar o diretório na linha abaixo para o caminho onde colocou o executável
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitor\\Desktop\\Loraine\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        
        case01(driver);
//        Case02.case02(driver);
//        returnToInitialPage(driver);
//        Case03.case03(driver);
//        returnToInitialPage(driver);
//        Case04.case04(driver);
//        returnToInitialPage(driver);
//        Case05.case05(driver);
//        returnToInitialPage(driver);
        Case06.case06(driver);

        driver.close();
    }

    private static void returnToInitialPage(WebDriver driver) {
        WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    private static void case01(WebDriver driver) {
        System.out.println("Test: Case01");
        driver.findElement(By.className("logo"));
        driver.findElement(By.className("sf-menu"));
    }


}