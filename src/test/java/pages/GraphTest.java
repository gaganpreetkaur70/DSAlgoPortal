package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class GraphTest extends HomeTest {
	
	
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
    public void GetStarted_Graph() {
    	String url="https://dsportalapp.herokuapp.com/home";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    	WebElement GetStarted=driver.findElement(By.xpath("//div//div//div//a[@href='graph']"));
    	GetStarted.click();
    }
    @Test(dependsOnMethods="GetStarted_Graph")
    public void ClickGraphLink() {
    	String url="https://dsportalapp.herokuapp.com/graph/";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement GraphLink=driver.findElement(By.linkText("Graph"));
    	GraphLink.click();
    }
    @Test(dependsOnMethods="ClickGraphLink")
    public void TryHere_GraphLink() {
    	String url="https://dsportalapp.herokuapp.com/graph/graph/";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement TryHereLink=driver.findElement(By.linkText("Try here>>>"));
		TryHereLink.click();	
    }
    @Test(dependsOnMethods="TryHere_GraphLink")
    public void TextboxToEnterTheCode_Graph() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
    }
    @Test(dependsOnMethods="TextboxToEnterTheCode_Graph")
    public void GraphRepresentations_Click() {
    	String url="https://dsportalapp.herokuapp.com/graph/graph/";
    	driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GraphReperesentation=driver.findElement(By.linkText("Graph Representations"));
		GraphReperesentation.click();
    }
    @Test(dependsOnMethods="GraphRepresentations_Click")
    public void TryHere_GraphRepresentation() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement TryHereRepresentation=driver.findElement(By.linkText("Try here>>>"));
    	TryHereRepresentation.click();
    }
    @Test(dependsOnMethods="TryHere_GraphRepresentation")
    public void TextboxToEnterTheCode_Representation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
    }
  @Test(priority=2)
    public void PracticeQuestion_Graph() {
    	String url="https://dsportalapp.herokuapp.com/graph/graph-representations/";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement PracticeQuest=driver.findElement(By.linkText("Practice Questions"));
    	PracticeQuest.click();
    }
  @Test(priority=3)
  public void signout() {
	  String url="https://dsportalapp.herokuapp.com/home";
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement SignOut=driver.findElement(By.linkText("Sign out"));
	  SignOut.click();
  }
  
  @Test(dependsOnMethods="signout")
  public void closeBrowser() {
	  driver.close();
  }
}
