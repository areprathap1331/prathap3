package notesjava.Selenium.Paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
    public static void main(String[]args) throws InterruptedException{
        System.setProperty("webdriver.chrome.drive","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://paytm.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Paytm for Consumer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Paytm For Business']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[text()='Recharge & Pay Bills on Paytm.']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Electricity']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//div/ul//li[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div//ul//li[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[text()='Proceed to Recharge']")).click();
    }
}
