package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Bilal\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver= new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver()
    {
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }
}
