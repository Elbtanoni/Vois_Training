package Start;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.Test;

import io.netty.util.Timeout;

public class Suit1 extends Open {
	
	@Test
	public  void test1() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		String username = "standard_user";
		String password = "secret_sauce";
		try {
		Login.login(username, password);
		Shoping select = new Shoping();	
		select.select(1, 0, 1, 0, 1, 0);
		CheckOut checkout = new CheckOut();
		checkout.checkout(firstname, lastname, zip);
		Finish done = new Finish();
		done.order();
		done.finish();
		LogOut logout = new LogOut();
		logout.logout();
		System.out.println("success");

		}
		catch(Exception e) {
			System.out.println("error in user name or password");
			driver.navigate().refresh();
		}
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
			done.finish();
			LogOut logout = new LogOut();
			logout.logout();
			System.out.println("success");
	
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
				done.finish();
				LogOut logout = new LogOut();
				logout.logout();
				System.out.println("success");
	
				}
				catch(Exception e) {
					System.out.println("error in user name or password");
					driver.navigate().refresh();
				}
				driver.close();
	}

}
