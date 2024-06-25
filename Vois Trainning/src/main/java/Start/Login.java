package Start;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Open {

	String username;
	String password;


	
	public void login(String a,String b) {
		username = a;
		password = b;

		driver.findElement(By.cssSelector("[data-test=username]")).sendKeys(username);
		driver.findElement(By.cssSelector("[data-test=password]")).sendKeys(password);
		driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

	}
	
}
