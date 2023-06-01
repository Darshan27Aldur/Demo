package qsp2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerclass2
{
	public class Runnerclass extends Genericclass
	{
		@Test
		public void Validlogin() throws InterruptedException
		{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log in to Facebook" );
		System.out.println("1");
	}
}
}