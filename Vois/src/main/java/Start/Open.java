package Start;

import java.lang.classfile.instruction.ExceptionCatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	

public class Open {
	static String url = "https://www.saucedemo.com/";
	static WebDriver driver = new ChromeDriver();
	static String firstname = "Ahmed";
	static String lastname = "Mohamed";
	static String zip = "12345a";
	 String username ;
	 String password ;

	
			
public static void main(String[] args) {
	driver.get(url);
	driver.manage().window().maximize();
	Suit1 tests = new Suit1();
	tests.test1();
	tests.test2();
	tests.test3();

}
//@Test
}

