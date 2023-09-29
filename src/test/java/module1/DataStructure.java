package module1;

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

public class DataStructure {
	static WebDriver driver=new ChromeDriver();
	
	
@Test (priority=1)
public void openwebsite() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src/test/resources/driver/chromedriver.exe");
    
    String url="https://dsportalapp.herokuapp.com/home";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(url);
    LoggerLoad.info("Website is opened successfully on chrome browser");
}


@Test (priority = 2)
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

@Test (priority = 3)
public void openDataStructure() {
	
	 driver.findElement(By.xpath("//div[3]/div/div/div/a")).click();
	 LoggerLoad.info("Data Structure page opened");
}

@Test (priority = 4)
public void openTimeComplexity() {
	
	 driver.findElement(By.xpath("//div[2]/ul/a[@class='list-group-item']")).click();
	 LoggerLoad.info("Time Complexity page opened");
}


@Test (priority = 4)
public void openPracticeQuestion() {
	
	 driver.findElement(By.xpath("//div[2]/div/div/div/a[@class='list-group-item']")).click();
	 LoggerLoad.info("Practice Question page opened");
}
}
