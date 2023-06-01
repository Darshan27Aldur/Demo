package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Write_multipledata_Excel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Excel/TestData1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","./sw/chromedriverdd.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		   List<WebElement> all_Links =driver.findElements(By.xpath("//a"));
		   int count=all_Links.size();
		   for(int i=0; i<count; i++)
		   {
			   Row r=sh.createRow(i);
			   Cell c=r.createCell(0);
			   String value=all_Links.get(i).getAttribute("href");
			   c.setCellValue(value);
		   }
		   FileOutputStream fos=new FileOutputStream("./Excel/TestData1.xlsx");
			book.write(fos);
		   }

}


