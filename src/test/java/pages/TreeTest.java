package pages;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreeTest {
	public WebDriver driver;
	
@BeforeTest
public void launchBrowser() {
	System.out.println("launching Chrome browser");
	driver = new ChromeDriver();
	String url = "https://dsportalapp.herokuapp.com/";
	driver.get(url);
	WebElement GetStartedLink = driver.findElement(By.linkText("Get Started"));
	GetStartedLink.click();
	WebElement login = driver.findElement(By.linkText("Sign in"));
	login.click();
	WebElement username=driver.findElement(By.id("id_username"));
	username.sendKeys("testdsalgo18@gmail.com");
	WebElement password=driver.findElement(By.id("id_password"));
	password.sendKeys("Test1237@");
	WebElement LoginButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
	LoginButton.click();
	
}

  @Test (priority = 1)
	  public void Treelink() {
	  WebElement GetStartedTreeLink = driver.findElement(By.xpath("//a[@href='tree']"));
	  GetStartedTreeLink.click();
	  WebElement OverviewLink=driver.findElement(By.partialLinkText("Trees"));
	  OverviewLink.click();
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
	  Tryhere.click();
	  WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
	  Editorbox.sendKeys("print(\"Hello world\")");
      try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
      Runbutton.click();
      try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.navigate().back();
  }
  
  
  @Test (priority = 2)
  public void Terminologieslink() {
  WebElement Tlink = driver.findElement(By.xpath("//a[normalize-space()='Terminologies']"));
  Tlink.click();
  WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
  Tryhere.click();
  WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
  Editorbox.sendKeys("print(\"Hello world\")");
  try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}



@Test (priority = 4)
public void Treetraverse() {
WebElement Tlink2 = driver.findElement(By.xpath("//a[normalize-space()='Tree Traversals']"));
Tlink2.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}

@Test (priority = 5)
public void Traverseillus() {
WebElement Tlink3 = driver.findElement(By.xpath("//a[normalize-space()='Traversals-Illustration']"));
Tlink3.click();
WebElement Tryhere=driver.findElement(By.partialLinkText("here"));
Tryhere.click();
WebElement Editorbox = driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
Editorbox.sendKeys("print(\"Hello world\")");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();
driver.navigate().back();
}


@AfterTest
public void endTest() {
	  driver.quit();
}
}




  	  
	  
  

