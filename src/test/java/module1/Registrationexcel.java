package module1;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Registrationexcel {
	public WebDriver driver;
	XSSFWorkbook ExcelWBook = null;
	XSSFSheet ExcelWSheet;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
	
	}
	@Test
	public void testHome() {
		driver = new ChromeDriver();
		File excelFilePath = new File ("/Users/shreyajoshi/Desktop/DSAlgo.xlsx");
		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream(excelFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String url = "https://dsportalapp.herokuapp.com/home";
		String expected = "NumpyNinja";
		driver.get(url);
		String actual = driver.getTitle();
		Assert.assertEquals(actual,expected);
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
	    try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
	try {
		ExcelWBook = new XSSFWorkbook(inputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     //To access the sheet
     ExcelWSheet = ExcelWBook.getSheetAt(0);
     //To access total rows
     int ttlRows = ExcelWSheet.getLastRowNum()+1;
     //read row outer for loop
     for(int currentRow = 0; currentRow<=ttlRows;currentRow++)
     {

    	 //WebDriver driver = new ChromeDriver();
    	 //driver.get("https://dsportalapp.herokuapp.com/register");
    	 driver.findElement(By.id("id_username")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
    	 driver.findElement(By.id("id_password1")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
    	 driver.findElement(By.id("id_password2")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(2).toString());
    	 WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
         registerButton.click();
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 System.out.println("\n");
     } 
          try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	
	@AfterTest
	public void usersignout() {    	
         WebElement SignoutLink = driver.findElement(By.xpath("//a[normalize-space()='Sign out']"));
         SignoutLink.click();
            }      
    	    }








	    	
	    	

	            
	        		
	        		
	        		
	        		
	     
	        		
	  
	         	                
	        				
	        		

	           

				

