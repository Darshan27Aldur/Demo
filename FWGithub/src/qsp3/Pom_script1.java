package qsp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script1
{
	 //declaration
	@FindBy(name="username")
	private WebElement unTbox;
	@FindBy(name="pwd")
	private WebElement pwdTbox;
	@FindBy(xpath="//div[.='Login']")
	private WebElement lginBtn;
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement Tsk;
	@FindBy(xpath="//div[.='Reports']")
	private WebElement Rep;
	@FindBy(id="logoutLink")
	private WebElement lout;
	
	
	
	
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
		lginBtn.click();
		
	}
	public void click_tsk()
	{
		Tsk.click();
		
	}
	public void click_rep()
	{
		Rep.click();
	}
	
	public void click_lout()
	{
		lout.click();
		
	}
}

	
