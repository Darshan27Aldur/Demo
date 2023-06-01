package Basic_frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script1 
{
	 //declaration
		@FindBy(id="email")
		private WebElement unTbox;
		@FindBy(id="pass")
		private WebElement pwdTbox;
		@FindBy(name="login")
		private WebElement loginButton;
		
		
		//initilization
		public Pom_script1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//utilization
		public void unData(String un)
		{
			unTbox.sendKeys(un);
		}
		public void pwdData(String pwd)
		{
			pwdTbox.sendKeys(pwd);
		}
		public void clickLogin()
		{
			loginButton.click();
			
		}
}
