package module1;

import java.time.Duration;

import org.apache.logging.log4j.plugins.di.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;
import net.bytebuddy.implementation.bytecode.ShiftRight;

public class PracticeQuestion {
	static WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reshm\\eclipse-workspace\\DSAlgoAppTestNG\\src\\test\\resources\\driver\\chromedriver.exe");
			
	}
    @Test(priority=1)	
	public void OpenWebsite() {
		String url="https://dsportalapp.herokuapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
    @Test(dependsOnMethods="OpenWebsite")
    public void GetStartedLink() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement GetStarted=driver.findElement(By.xpath("//button[@class='btn']"));
        GetStarted.click();
    }
    @Test(dependsOnMethods="GetStartedLink")
    public void SignInLink() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement SignIn= driver.findElement(By.partialLinkText("Sign"));
		SignIn.click();
    }
    @Test(dependsOnMethods="SignInLink")
    public void login() {
    	String url="https://dsportalapp.herokuapp.com/login";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement unametextbox=driver.findElement(By.id("id_username"));
		unametextbox.sendKeys("abc123@gmail.com");
		WebElement passwdtextbox=driver.findElement(By.id("id_password"));
		passwdtextbox.sendKeys("Aaa@1234");
		WebElement LoginButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
		LoginButton.click();
		LoggerLoad.info("User logged in to the website successfully");
    }
	@Test(dependsOnMethods="login")
	public void clickGetStarted_Array() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStarted=driver.findElement(By.xpath("//div//div//div//a[@href='array']"));
		GetStarted.click();
		LoggerLoad.info("User is able to click on the Get started link of the array");
		
	}
	@Test(priority=3)
	public void ArrayInPython() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ArrayInPythonLink=driver.findElement(By.partialLinkText("Python"));
		ArrayInPythonLink.click();
		LoggerLoad.info("User can select the link: Array in Python");
	}
	@Test(dependsOnMethods="ArrayInPython")
	public void PracticeQuestions() {
		String url="https://dsportalapp.herokuapp.com/array/applications-of-array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement PracticeQuestionsLink=driver.findElement(By.partialLinkText("Practice"));
		PracticeQuestionsLink.click();	
	}
	@Test(dependsOnMethods="PracticeQuestions")
	public void SearchTheArray(){
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchTheArray=driver.findElement(By.partialLinkText("Search"));
		SearchTheArray.click();	
		LoggerLoad.info("User can click on Search the Array link in Practice Question");
	}
	@Test(dependsOnMethods="SearchTheArray")
	public void Question1_1() throws InterruptedException {
		String url="https://dsportalapp.herokuapp.com/question/1";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement inputdata=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		inputdata.sendKeys(org.openqa.selenium.Keys.CONTROL,"a");
		inputdata.sendKeys(org.openqa.selenium.Keys.DELETE);
		//inputdata.clear();
		inputdata.sendKeys("print(\"Hello\")");
		WebElement RunButton=driver.findElement(By.xpath("//button[@type='button']"));
		RunButton.click();
	}
	
	@Test(priority=4)
	public void MaxConsecutiveOnes() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement MaxConsecutiveLink=driver.findElement(By.partialLinkText("Max"));
		MaxConsecutiveLink.click();
		LoggerLoad.info("User can click on Max Consicutive Ones");
	}
	@Test(dependsOnMethods="MaxConsecutiveOnes")
	public void Question1_2() throws InterruptedException {
		String url="https://dsportalapp.herokuapp.com/question/1";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement inputdata=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		inputdata.sendKeys(org.openqa.selenium.Keys.CONTROL,"a");
		inputdata.sendKeys(org.openqa.selenium.Keys.DELETE);
		//inputdata.clear();
		inputdata.sendKeys("print(\"Hello\")");
		WebElement RunButton=driver.findElement(By.xpath("//button[@type='button']"));
		RunButton.click();
	}
	@Test(priority=5)
	public void FindNumberWithEvenNumber() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement FindNumber=driver.findElement(By.partialLinkText("Find"));
		FindNumber.click();
		LoggerLoad.info("User can click on FindNumbers with Even Number Of Digits");
	}
	@Test(dependsOnMethods="FindNumberWithEvenNumber")
	public void Question1_3() throws InterruptedException {
		String url="https://dsportalapp.herokuapp.com/question/1";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement inputdata=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		inputdata.sendKeys(org.openqa.selenium.Keys.CONTROL,"a");
		inputdata.sendKeys(org.openqa.selenium.Keys.DELETE);
		//inputdata.clear();
		inputdata.sendKeys("print(\"Hello\")");
		WebElement RunButton=driver.findElement(By.xpath("//button[@type='button']"));
		RunButton.click();
	}
	@Test(priority=6)
	public void SquaresOfSortedArray() {
		String url="https://dsportalapp.herokuapp.com/array/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SquareOfSortedClick=driver.findElement(By.partialLinkText("Squares"));
		SquareOfSortedClick.click();
		LoggerLoad.info("User can click on Squares of Sorted Array");
	}
	@Test(dependsOnMethods="SquaresOfSortedArray")
	public void Question1_4() throws InterruptedException {
		String url="https://dsportalapp.herokuapp.com/question/1";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement inputdata=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		inputdata.sendKeys(org.openqa.selenium.Keys.CONTROL,"a");
		inputdata.sendKeys(org.openqa.selenium.Keys.DELETE);
		//inputdata.clear();
		inputdata.sendKeys("print(\"Hello\")");
		WebElement RunButton=driver.findElement(By.xpath("//button[@type='button']"));
		RunButton.click();
	}
}
