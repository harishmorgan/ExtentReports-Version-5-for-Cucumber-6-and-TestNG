package utils.helper;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class HelperClass {
     
    private static HelperClass helperClass;
     
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;
     
     private HelperClass() {
          
    	 WebDriverManager.chromedriver().setup();
     	 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().window().maximize();
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
 
     
    public static WebDriver getDriver() {
        return driver;              
    }
     
    public static void setUpDriver() {
         
        if (helperClass==null) {
             
            helperClass = new HelperClass();
        }
    }
     
     public static void tearDown() {
          
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
          
         helperClass = null;
     } 
     
}