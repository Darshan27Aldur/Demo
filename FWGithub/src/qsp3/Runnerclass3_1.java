package qsp3;

import org.testng.annotations.Test;

public class Runnerclass3_1 extends Genericclass1
{
	@Test
  public void validlogin() throws InterruptedException
  {
		Pom_script1 p=new Pom_script1(driver);
		    p.unData("admin");
		    Thread.sleep(2000);
		    p.pwdData("manager");
		    Thread.sleep(2000);
		    p.clickLogin();
		    Thread.sleep(2000);
		    p.click_tsk();
		    Thread.sleep(2000);
		    p.click_rep();
		    Thread.sleep(2000);
		    p.click_lout();
		    Thread.sleep(2000);
		    
  }
}

