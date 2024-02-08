package notesjava.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncludingJS {
    public static void main(String[] args) throws  Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement r = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
//          Rightclick.r(r,driver);
        JavaScript.color(r, driver);
        WebElement Login = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
        JavaScript.click(Login, driver);
        //generate alert//
////        JavaScript.Alert(driver,"you clicked on login button.....");
//        JavaScript.RefreshBrowser(driver);
//    WebElement d= driver.findElement(By.xpath("/html/body/div/section[5]/div/div/a[2]"));
//        JavaScript.ScrollPageDown(d,driver);
        driver.findElement(By.xpath("//*[@id=\"signInEmail\"]")).sendKeys("PRATHAP");
        driver.findElement(By.xpath("//*[@id=\"signInPassword\"]")).sendKeys("6304791743");
        driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[1]/a/img")).click();
        driver.findElement(By.xpath("//a[text()='About']")).click();
    WebElement e=driver.findElement(By.xpath("//a[@class='w-icons-socTweet']"));
    JavaScript.m(e,driver);
    driver.findElement(By.xpath("")).click();
    WebElement ww= driver.findElement(By.xpath("//span[text()='Media']"));
    JavaScript.m(ww,driver);

    }
}
