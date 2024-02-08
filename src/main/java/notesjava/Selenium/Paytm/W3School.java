package notesjava.Selenium.Paytm;

import notesjava.Selenium.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
    public static void main (String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("html tutorial");
       driver.findElement(By.xpath("//i[@id='learntocode_searchicon']")).click();
       driver.findElement(By.xpath("//a[@title='CSS Tutorial']")).click();
       driver.findElement(By.xpath("//a[text()='CSS Introduction']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[text()='JAVASCRIPT']")).click();
        driver.findElement(By.xpath("//a[text()='SQL']"));
       driver.findElement(By.xpath("//a[text()='PYTHON']")).click();
       driver.findElement(By.xpath("//a[text()='Python Variables']")).click();
       driver.findElement(By.xpath("//a[text()='Variable Names']")).click();
    }
}
