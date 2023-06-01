package qsp;

import org.testng.annotations.Test;

public class Testng_groups
{
 @Test(groups= {"sanity"})
 public void test1()
 {
	 System.out.println("hello india");
	 }
 
 
 @Test(groups= {"sanity","smoke"})
 public void test2()
 {
	 System.out.println("hello asia");
 }
 
 
 @Test(groups= {"smoke"})
 public void test3()
 {
	 System.out.println("hello world");
 }
 
}
