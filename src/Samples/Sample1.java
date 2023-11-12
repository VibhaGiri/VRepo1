package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class sample1
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "C:\\repos\\Selenium\\Demo\\Drivers\\Geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumq.org/");
        driver.close();
    }
}

