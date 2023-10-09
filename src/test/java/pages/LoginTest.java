package pages;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class LoginTest extends HomeTest {
	
@Test
public void login() throws IOException, InterruptedException {
	
	WebElement login = driver.findElement(By.linkText("Sign in"));
	login.click();
	LoggerLoad.info("Clicked on the login link");	
	
	//Read data from excel file
	String path = System.getProperty("user.dir")+"/src/test/resources/UserData/User.xlsx";
	LoggerLoad.info(path);
	File ExcelFile = new File(path);
	FileInputStream Fis = new FileInputStream(ExcelFile);
	XSSFWorkbook workbook = new XSSFWorkbook(Fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	Iterator<Row> row = sheet.rowIterator();
	
	while(row.hasNext()) {
		
		Row currRow = row.next();
		
		if(currRow.getCell(0) != null) {
			
			driver.findElement(By.id("id_username")).sendKeys(currRow.getCell(0).toString());
		} 
		
		if(currRow.getCell(1) != null) {
		
			driver.findElement(By.id("id_password")).sendKeys(currRow.getCell(1).toString());
		}
		
		WebElement loginBtn = driver.findElement(By.xpath("//div//form//input[@type='submit']"));
		loginBtn.click();
			
			try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}			
	
}





}