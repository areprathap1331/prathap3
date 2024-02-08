package notesjava.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class YouTube {
    public static void main(String[]args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Dj Tillu songs");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);
       WebElement v= driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Pulsar Bike Full')]"));
       Thread.sleep(1000);
       Action pp=action.moveToElement(v).click().build();
       pp.perform();
       driver.findElement(By.xpath("//div[contains(@class,'yt-spec-touch-feedback')]")).click();
    }
}
