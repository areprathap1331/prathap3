package notesjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Zomoto {
    public static void main(String[]args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/");
        Thread.sleep(500);
        Actions actions=new Actions(driver);
      WebElement b=driver.findElement(By.xpath("//p[contains(@class,'sc-1hez2tp-0 bBZBL')]"));
        Action b1=actions.moveToElement(b).click().build();
        b1.perform();
        driver.findElement(By.xpath("//div[text()='Dining Out']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Nightlife']")).click();
        Thread.sleep(500);
       driver.findElement(By.xpath("//div[text()='Delivery']")).click();
       driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("A1 Chicken Pakoda Point");
       driver.findElement(By.xpath("//p[text()='A1 Chicken Pakoda Point']")).click();
    }
}
