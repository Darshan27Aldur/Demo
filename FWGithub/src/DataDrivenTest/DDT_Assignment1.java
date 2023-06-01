package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Assignment1 {

	public static void main(String[] args) throws EncryptedDocumentException,IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		Cell c1=r.getCell(1);
		String value=c.toString();
		String value1=c1.toString();
		System.out.println(value);
		System.out.println(value1);
		
	System.setProperty("webdriver.chrome.driver","./sw/chromedriverdd.exe");
	  WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("value");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("value1");
    driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
