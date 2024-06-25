package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
	static String url = "https://www.saucedemo.com/";
	static String username = "standard_user";
	static String password = "secret_sauce";
	static String firstname = "Ahmed";
	static String lastname = "Mohamed";
	static String zip = "12345a";
	static WebDriver driver = new ChromeDriver();


public static void main(String[] args) {
	driver.get(url);
	driver.manage().window().maximize();

	Login data = new Login();
	data.login(username, password);
	Shoping select = new Shoping();	
	select.select(1, 0, 1, 0, 1, 0);
	CheckOut checkout = new CheckOut();
	checkout.checkout(firstname, lastname, zip);
	
	
}  
}
