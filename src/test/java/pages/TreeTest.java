package pages;

import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreeTest extends HomeTest {
	
	

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

  @Test (priority = 2)
	  public void Treelink() {
	  JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  WebElement GetStartedTreeLink = driver.findElement(By.xpath("//a[@href='tree']"));
	  GetStartedTreeLink.click();
	  WebElement OverviewLink=driver.findElement(By.partialLinkText("Trees"));
	  OverviewLink.click();
	  WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
	  Tryhere.click();
	  WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
	  Editorbox.sendKeys("print(\"Hello world\")");
      WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
      Runbutton.click();
      driver.navigate().back();
  }
  
  
  @Test (dependsOnMethods = "Treelink")
  public void Terminologieslink() {
  WebElement Tlink = driver.findElement(By.xpath("//a[normalize-space()='Terminologies']"));
  Tlink.click();
  WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
  Tryhere.click();
  WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
  Editorbox.sendKeys("print(\"Hello world\")");
  WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
  Runbutton.click();
  driver.navigate().back();
  }

 

@Test (priority = 3)
public void TypesTreeslink() {
WebElement Tlink1 = driver.findElement(By.xpath("//a[normalize-space()='Types of Trees']"));
Tlink1.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}



@Test (priority = 4)
public void Treetraverse() {
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
WebElement Tlink2 = driver.findElement(By.xpath("//a[normalize-space()='Tree Traversals']"));
Tlink2.click();
JavascriptExecutor js2=(JavascriptExecutor)driver;
js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 5)
public void Traverseillus() {
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement Tlink3 = driver.findElement(By.xpath("//a[normalize-space()='Traversals-Illustration']"));
Tlink3.click();
JavascriptExecutor js2=(JavascriptExecutor)driver;
js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}


@Test (priority = 6)
public void Binarytrees() {
WebElement Tlink4 = driver.findElement(By.xpath("//a[normalize-space()='Binary Trees']"));
Tlink4.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}


@Test (priority = 7)
public void TypesBinarytrees() {
WebElement Tlink5 = driver.findElement(By.xpath("//a[normalize-space()='Types of Binary Trees']"));
Tlink5.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}
@Test (priority = 8)
public void Pythonimplement() {
WebElement Tlink6 = driver.findElement(By.xpath("//a[normalize-space()='Implementation in Python']"));
Tlink6.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 9)
public void Binarytreetraverse() {
WebElement Tlink6 = driver.findElement(By.xpath("//a[normalize-space()='Binary Tree Traversals']"));
Tlink6.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}



@Test (priority = 10)
public void Binarytraverseone() {
WebElement Tlink7 = driver.findElement(By.xpath("//a[normalize-space()='Implementation of Binary Trees']"));
Tlink7.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 11)
public void Binarytraversetwo() {
WebElement Tlink8 = driver.findElement(By.xpath("//a[normalize-space()='Applications of Binary trees']"));
Tlink8.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 12)
public void Binarytraversethree() {
WebElement Tlink9 = driver.findElement(By.xpath("//a[normalize-space()='Binary Search Trees']"));
Tlink9.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 13)
public void Binarytraversefour() {
WebElement Tlink10 = driver.findElement(By.xpath("//a[normalize-space()='Implementation Of BST']"));
Tlink10.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}



}




  	  
	  
  

