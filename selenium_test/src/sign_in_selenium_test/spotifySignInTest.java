package sign_in_selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spotifySignInTest {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://accounts.spotify.com/tr/login");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void signIn() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("login-username")).sendKeys("username");
		driver.findElement(By.id("login-password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
	}
	
	public void continueWithFacebook() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@analytics-event=\"Facebook Button\"]")).click();
	}
	
	public void continueWithApple() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@analytics-event=\"Apple Button\"]")).click();
	}
	
	public void forgotYourPassword() {
		driver.findElement(By.id("reset-password-link")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("form_input")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("form_send")).click();
	}
	
	public void clearForm() {
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-password")).clear();
	}

}
