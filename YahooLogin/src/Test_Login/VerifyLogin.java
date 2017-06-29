package Test_Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\seleniumPractice\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,60);
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	driver.manage().window().maximize();
	String username="qaplanet1";
	String passwd="user1";
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(passwd);
	driver.findElement(By.name("Submit")).click();
	String weltext=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
	if(weltext.equals("Welcome"+username))
	{
	 System.out.println("Login success");
	}
	else
	{
		System.out.println("Login failed");
		driver.quit();
		return;
	}
	
	
	}

	}

}
