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

        driver.close();
    }



}