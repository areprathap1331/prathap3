package notesjava.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Xpath2simpleProgram {
    public static void main(String[]args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.Google.com/");
        Actions actions=new Actions(driver);
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("instagram.com");
        Thread.sleep(500);
        WebElement p=driver.findElement(By.xpath("//span[text()='instagram']"));
        Action p1=actions.doubleClick(p).build();
        p1.perform();
        Thread.sleep(500);
        WebElement n=driver.findElement(By.xpath("//h3[text()='Instagram']"));
        Thread.sleep(500);
        Action n1=actions.doubleClick(n).build();
        n1.perform();
        Thread.sleep(500);
//        WebElement type1=driver.findElement(By.xpath("//input[@name='username']"));
//        Action builder =actions.click().sendKeys("mr_attitude_wala_7830").build();
//        builder.perform();
//                .sendKeys("mr_attitude_wala_7830");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mr_attitude_wala_7830");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prathap625");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
        driver.findElement(By.xpath("//svg[@aria-label='Reels']")).click();
//        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
    }
}
