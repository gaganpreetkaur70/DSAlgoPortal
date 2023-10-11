package pages;

import org.testng.annotations.Test;

import dsutilities.LoggerLoad;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends HomeTest {
	
	@Test
	public void testHome() throws IOException, InterruptedException {
		String  url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();	
		String path = System.getProperty("user.dir")+"/src/test/resources/UserData/DSAlgo.xlsx";
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
			
				driver.findElement(By.id("id_password1")).sendKeys(currRow.getCell(1).toString());
			}
			
			if(currRow.getCell(2) != null) {
				driver.findElement(By.id("id_password2")).sendKeys(currRow.getCell(2).toString());
			}
			
		WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerButton.click();
}	
	}
}

	
		
	
		/*XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;	
		File excelFilePath =  new File (System.getProperty("user.dir")+"/src/test/resources/UserData/DSAlgo.xlsx");
		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream(excelFilePath);
		} catch (FileNotFoundException e) {
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
    	 driver.findElement(By.id("id_username")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
    	 driver.findElement(By.id("id_password1")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
    	 driver.findElement(By.id("id_password2")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(2).toString());
    	 WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
         registerButton.click();
          try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	}
}*/




