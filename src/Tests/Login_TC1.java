/* package Tests;
import CommonTests.*;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.lang.Thread;

//import static java.lang.Thread.sleep;

public class Login_TC1 {
    public static void main(String[] args) throws InterruptedException {
        {
            System.setProperty("driver.chrome.driver", "C:\\Users\\raghu\\Downloads\\Google_Chrome_(64bit)_v114.0.5735.199.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/books");

            HomePage home = new HomePage(driver);
            LoginPage login = new LoginPage(driver);
            LogoutPage logout = new LogoutPage(driver);

            home.ClickLogin();
            login.EnterUserName("vg1");
            login.EnterPassword("#Welcome123");
            login.Clicklogin();
           // Thread.sleep(3000);
            System.out.println("User logged in successfully");
            logout.Loggingout();
            System.out.println("User logged out successfully");
            driver.quit();
            System.out.println("driver quits");

        }
    }
}*/