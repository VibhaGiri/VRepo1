package CommonTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import CommonTests.*;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.lang.Thread;

import java.util.concurrent.TimeUnit;

public class LogoutPage
{
    WebDriver driver;
    public LogoutPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Loggingout()
    {
        System.out.println("Clicking submit");
       driver.findElement(By.id("submit")).click();
       driver.findElement(By.linkText("google")).click();
      // driver.findElement(By.te)
     //  driver.getCurrentUrl()
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       //driver.findElement(By.xpath("//button[text()='Log out']")).click();
//
    }
}
