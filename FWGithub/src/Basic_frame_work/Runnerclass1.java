package Basic_frame_work;

import org.testng.annotations.Test;

import Basic_frame_work.Pom_script1;

public class Runnerclass1 extends Generic_scrript_facebook
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
}
}
