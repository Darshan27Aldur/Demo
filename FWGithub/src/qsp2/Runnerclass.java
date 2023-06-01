package qsp2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerclass extends Genericclass
{
	@Test
	public void Validlogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
}
	@Test
	public void Validlogin1() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	Assert.fail();
	System.out.println(driver.getTitle());
	}
}