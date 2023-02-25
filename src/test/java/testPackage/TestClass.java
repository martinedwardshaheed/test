package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestClass {
 public static WebDriver driver;
  @BeforeSuite
    public void testMethod(){

      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.navigate().to("https://demo.nopcommerce.com/");
      driver.manage().window().maximize();
  }
  @AfterSuite
    public void afterMethod(){
     // driver.quit();
  }

}
