package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_script 
{
 @Test
 public void Validlogin() throws InterruptedException
 {
 System.setProperty("webdriver.chrome.driver","./sw/chromedriverdd.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 Pom_script p=new Pom_script(driver);
 p.clickLogin();
 Thread.sleep(2000);
 driver.navigate().refresh();
  Thread.sleep(2000);
 p.clickLogin();
}
 
}
