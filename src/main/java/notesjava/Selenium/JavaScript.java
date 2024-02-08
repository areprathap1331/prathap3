package notesjava.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {
    public static void pp(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor m = (JavascriptExecutor) driver;
        m.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

    }

    public static void color (WebElement element, WebDriver driver) {
        JavascriptExecutor colour= (JavascriptExecutor) driver;
        colour.executeScript("arguments[0].style.border='5px solid blue'",element);

    }
    public static void m(WebElement k,WebDriver driver){
        JavascriptExecutor n =(JavascriptExecutor) driver;
        Actions h=new Actions(driver);
        Action h1=h.moveToElement(k).click().build();
        h1.perform();
    }
    public static void click(WebElement m,WebDriver driver){
        JavascriptExecutor c=(JavascriptExecutor) driver;
        c.executeScript("arguments[0].click();",m);
    }
    public static void Alert(WebDriver driver,String message){
        JavascriptExecutor a=(JavascriptExecutor) driver;
        a.executeScript("alert('"+message +"')");
    }
    public static void RefreshBrowser(WebDriver driver){
        JavascriptExecutor x=(JavascriptExecutor) driver;
        x.executeScript("history.go(0)");
    }
    public static void ScrollPageDown(WebElement n,WebDriver driver){
        JavascriptExecutor jj=(JavascriptExecutor) driver;
    //    jj.executeScript("arguments[0].scrollInterView",n);
        jj.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}
