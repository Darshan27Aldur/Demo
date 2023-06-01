package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_script2
{
	 @Test
	 public void Validlogin() throws InterruptedException
	 {
	 System.setProperty("webdriver.chrome.driver","./sw/chromedriverdd.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 Pom_script p=new Pom_script(driver);
	       p.unData("admin");
	       Thread.sleep(2000);
	       p.pwdData("manager");
	       Thread.sleep(2000);
	       p.clickLogin();
	 }
}
