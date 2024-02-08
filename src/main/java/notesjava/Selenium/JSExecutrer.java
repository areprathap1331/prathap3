package notesjava.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutrer {
    public static void main(String[]args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement element=(WebElement) js.executeScript(" return document.getElementById('email');");
       element.sendKeys("9010834692");
       WebElement element1=(WebElement)  js.executeScript(" return document.getElementsByName('pass')[0];");
       element1.sendKeys("prathar");
       WebElement kk=(WebElement) js.executeScript("return document.getElementsByTagName('a')[2];");
       kk.click();
       WebElement hh=(WebElement)  js.executeScript("  document.getElementsByName('firstname')[0];");
       hh.sendKeys("prashu");
       WebElement element2=(WebElement) js.executeScript(" document.getElementsByName('lastname')[0];");
       element2.sendKeys("Are");
       WebElement pp=(WebElement) js.executeScript("return ");
    }
}
