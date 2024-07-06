package Start;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.netty.util.Timeout;

public class Suit1 extends Finish {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

	public Suit1() {
		driver.get(url);
		driver.manage().window().maximize();

	}

	
	@Test
	public  void test1() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String username = "standard_user";
		String password = "secret_sauce";
		//try {
		Login.login(username, password);
		Shoping select = new Shoping();	
		select.select(1, 0, 1, 0, 1, 0);
		CheckOut checkout = new CheckOut();
		checkout.checkout(firstname, lastname, zip);
		Finish done = new Finish();
		done.order();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test=total-label]")));
		String price = driver.findElement(By.cssSelector("[data-test=total-label]")).getText();
		done.finish();
		LogOut logout = new LogOut();
		logout.logout();
		assertEquals(price, "Total: $58.291");
		System.out.println("success 1");
		

//		}
//		catch(Exception e) {
//			System.out.println("error in user name or password");
//			driver.navigate().refresh();
//		}
	}
		
		@Test
		public void test2() {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			String username = "standard_user";
			String password = "secret_sauce";
			try {
			Login.login(username, password);
			Shoping select = new Shoping();	
			select.select(1, 1, 1, 1, 1, 1);
			CheckOut checkout = new CheckOut();
			checkout.checkout(firstname, lastname, zip);
			Finish done = new Finish();
			done.order();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test=total-label]")));
			String price = driver.findElement(By.cssSelector("[data-test=total-label]")).getText();
			done.finish();
			LogOut logout = new LogOut();
			logout.logout();
			assertEquals(price, "Total: $140.34");
			System.out.println("success 2");
	
			}
			catch(Exception e) {
				System.out.println("error in user name or password");
				driver.navigate().refresh();

			}
			}
	
			@Test
			public void test3() {
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

				String username = "standard_user";
				String password = "secret_sauce";
				try {
				Login.login(username, password);
				Shoping select = new Shoping();	
				select.select(1, 1, 1, 0, 0, 0);
				CheckOut checkout = new CheckOut();
				checkout.checkout(firstname, lastname, zip);
				Finish done = new Finish();
				done.order();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test=total-label]")));
				String price = driver.findElement(By.cssSelector("[data-test=total-label]")).getText();
				done.finish();
				LogOut logout = new LogOut();
				logout.logout();
				assertEquals(price, "Total: $60.45");
				System.out.println("success 3");
	
				}
				catch(Exception e) {
					System.out.println("error in user name or password");
					driver.navigate().refresh();
				}
				driver.close();
	}

}
