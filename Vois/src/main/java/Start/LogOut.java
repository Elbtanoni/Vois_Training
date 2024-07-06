package Start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LogOut extends Open {

	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[data-test=logout-sidebar-link]")).click();
	};
	 
	
}
