package module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class Array {
	
	static WebDriver driver=new ChromeDriver();
	
	@Test(priority=1)
	public void openwebsite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reshm\\eclipse-workspace\\DSAlgoAppTestNG\\src\\test\\resources\\driver\\chromedriver.exe");
	    
	    String url="https://dsportalapp.herokuapp.com/";
	    driver.manage().window().maximize();;
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	    LoggerLoad.info("Website is opened successfully on chrome browser");
	}
	@Test(priority=2)
	public void Login() {
		String url="https://dsportalapp.herokuapp.com/register";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SignIn= driver.findElement(By.partialLinkText("Sign"));
		SignIn.click();
		WebElement unametextbox=driver.findElement(By.id("id_username"));
		unametextbox.sendKeys("abc123@gmail.com");
		WebElement passwdtextbox=driver.findElement(By.id("id_password"));
		passwdtextbox.sendKeys("Aaa@1234");
		WebElement LoginButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
		LoginButton.click();
		LoggerLoad.info("User logged in to the website successfully");
		
	}
	@Test(priority=4)
	public void clickGetStarted() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStarted=driver.findElement(By.xpath("//div//div//div//a[@href='array']"));
		GetStarted.click();
		LoggerLoad.info("User is able to click on the Get started link of the array");
		
	}
	
	@Test(priority=5)
	public void clickdrpdownArray() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement clickdrpdown=driver.findElement(By.xpath("//div//div//div//a[contains(text(),'Data Structures')]"));
		clickdrpdown.click();
		WebElement clickArray=driver.findElement(By.xpath("//div//div//div//div//a[contains(text(),'Arrays')]"));
		clickArray.click();	
		LoggerLoad.info("User can select option:Array in dropdown list");
	}
	@Test(priority=6)
	public void ArrayPage() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ArrayInPythonLink=driver.findElement(By.partialLinkText("Python"));
		ArrayInPythonLink.click();
		LoggerLoad.info("User can select the link: Array in Python");
	}
	@Test(priority=7)
    public void TryHereLinkArrayInPython() throws InterruptedException {
		String url="https://dsportalapp.herokuapp.com/array/arrays-in-python/";
		driver.get(url);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(4000);
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Arrays in Python");
    	
    }
	@Test(priority=8)
	public void ArraysUsingListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement arrayusinglistlink=driver.findElement(By.partialLinkText("List"));
		arrayusinglistlink.click();
		LoggerLoad.info("User can click on: Arrays Using List");
	}
	@Test(priority=9)
	public void TryHereArraysUsingList() {
		String url="https://dsportalapp.herokuapp.com/array/arrays-using-list/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Arrays Using List");		
	}
	@Test(priority=10)
	public void BasicOperationListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement BasicOperationsInList=driver.findElement(By.partialLinkText("Operations"));
		BasicOperationsInList.click();
		LoggerLoad.info("User can click on Basic Operations in List");
		
	}
	@Test(priority=11)
	public void TryHereBasicOperationList() {
		String url="https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Basic Operations in List");
		
	}
	@Test(priority=12)
	public void ApplicationOfArrayClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ApplicationsOfArray=driver.findElement(By.partialLinkText("Applications"));
		ApplicationsOfArray.click();
		LoggerLoad.info("User can click on Application of Array");
	}
	
	@Test(priority=13)
	public void TryHereApplicationOfArray() {
		String url="https://dsportalapp.herokuapp.com/array/applications-of-array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Application of Array");
	}
	//Testcase no.41: Bellow test case precondition webpage is wrong. "Practice Question" link is not present in "Array Home page"
	/*@Test(priority=14)
	public void PracticeQuestions() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement PracticeQuestionsLink=driver.findElement(By.partialLinkText("Practice"));
		PracticeQuestionsLink.click();
		
	}*/
	
	@Test(priority=15)
	public void SearchTheArray(){
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchTheArray=driver.findElement(By.partialLinkText("Search"));
		SearchTheArray.click();	
		LoggerLoad.info("User can click on Search the Array link in Practice Question");
	}
	
	@Test(priority=16)
	public void MaxConsecutiveOnes() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement MaxConsecutiveLink=driver.findElement(By.partialLinkText("Max"));
		MaxConsecutiveLink.click();
		LoggerLoad.info("User can click on Max Consicutive Ones");
	}
	
	@Test(priority=17)
	public void FindNumberWithEvenNumber() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement FindNumber=driver.findElement(By.partialLinkText("Find"));
		FindNumber.click();
		LoggerLoad.info("User can click on FindNumbers with Even Number Of Digits");
		
	}
	
	@Test(priority=18)
	public void SquaresOfSortedArray() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SquareOfSortedClick=driver.findElement(By.partialLinkText("Squares"));
		SquareOfSortedClick.click();
		LoggerLoad.info("User can click on Squares of Sorted Array");
	}
}
