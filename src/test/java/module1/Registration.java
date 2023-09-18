package module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import dsutilities.LoggerLoad;

public class Registration {
	static WebDriver driver=new ChromeDriver();
	
	
@Test (priority=1)
public void openwebsite() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\reshm\\eclipse-workspace\\DSAlgoAppTestNG\\src\\test\\resources\\driver\\chromedriver.exe");
    
    String url="https://dsportalapp.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(url);
    LoggerLoad.info("Website is opened successfully on chrome browser");
}

@Test(priority=2)
public void GetStarted() {
	driver.navigate();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement getstarted=driver.findElement(By.partialLinkText("Started"));
	getstarted.click();
	LoggerLoad.info("Clicked on the link");	
}

@Test(priority=3)
public void Register() {
	String url="https://dsportalapp.herokuapp.com/register";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement UserNameTextBox=driver.findElement(By.id("id_username"));
	UserNameTextBox.sendKeys("abc123@gmail.com");
	LoggerLoad.info("Entered username");
	WebElement PasswdTextBox=driver.findElement(By.id("id_password1"));
	PasswdTextBox.sendKeys("Aaa@1234");
	LoggerLoad.info("Password entry");
	WebElement ConfirmPasswd=driver.findElement(By.id("id_password2"));
	ConfirmPasswd.sendKeys("Aaa@1234");
	LoggerLoad.info("Confirm Password entry");
	WebElement RegisterButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
	RegisterButton.click();
}

@Test(priority=4)
public void Login() {
	String url="https://dsportalapp.herokuapp.com/register";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement SignIn= driver.findElement(By.partialLinkText("Sign"));
	SignIn.click();
	WebElement unametextbox=driver.findElement(By.id("id_username"));
	unametextbox.sendKeys("abc123@gmail.com");
	WebElement passwdtextbox=driver.findElement(By.id("id_password"));
	passwdtextbox.sendKeys("Aaa@1234");
	WebElement LoginButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
	LoginButton.click();
	
}

}
