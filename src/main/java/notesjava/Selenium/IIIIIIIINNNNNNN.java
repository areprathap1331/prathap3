package notesjava.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IIIIIIIINNNNNNN {
    public static void main (String[]args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mr_attitude_wala_7830");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prathap625");
//        driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("9010834694");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("prathap");
//        driver.findElement(By.xpath("//span[text()='Not now']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text()='Log in']")).click();
//        driver.findElement(By.xpath("//p[@class='_ab25']")).click();
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        driver.findElement(By.xpath("//div[@role='button']")).click();
        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
    }
}
