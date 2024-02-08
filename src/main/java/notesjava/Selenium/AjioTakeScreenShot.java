package notesjava.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioTakeScreenShot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\prathap3\\target\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("chamkeela Angeelesi");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h3[@class=\"title-and-badge style-scope ytd-video-renderer\"]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class=\"yt-spec-touch-feedback-shape__fill\"]")).click();

    }
}
