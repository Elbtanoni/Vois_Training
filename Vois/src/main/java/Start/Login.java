package Start;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login extends Open {

	static String username;
	static String password;


	
	static public void login(String a,String b) {
		username = a;
		password = b;

		driver.findElement(By.cssSelector("[data-test=username]")).sendKeys(username);
		driver.findElement(By.cssSelector("[data-test=password]")).sendKeys(password);
		driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

	}
	
}
