package CommonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class HomePage
{
    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
   // By Loginbutton=By.id("login");
    public void ClickLogin()
    {
        driver.findElement(By.id("login")).click();
    }
}
