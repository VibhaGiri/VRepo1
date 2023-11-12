package CommonTests;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class LoginPage
{
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void EnterUserName(String name)
    {
        driver.findElement(By.id("userName")).sendKeys(name);
    }

    public void EnterPassword(String pass)
    {
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    public void Clicklogin()
    {
       driver.findElement(By.id("login")).submit();
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }
     //   driver.findElement(By. xpath("//*[text()='Login')]")).click();
    }

