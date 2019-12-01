package SecondMavenProject.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTestExecution 
{
	@Test
	public void chromeNavigationTest() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:/DBS/ChromeDriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.navigate().to("https://amazon.in"); //To navigate to an external site from one site
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test
	public void firefoxLoginTest()
	{
		System.setProperty("webdriver.gecko.driver", "C:/DBS/ChromeDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement userNamElement = driver.findElement(By.id("txtUsername"));
		userNamElement.sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String title = driver.getTitle();
		System.out.print("The page title is: "+title);
		driver.quit();
	}
	
	@Test
	public void ieLaunch()
	{
		System.setProperty("webdriver.ie.driver", "C:/DBS/ChromeDriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
	

}
