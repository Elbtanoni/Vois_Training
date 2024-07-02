package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Finish extends Open {
	
	public void finish() {
		
		driver.findElement(By.cssSelector("[data-test=finish]")).click();
		driver.findElement(By.cssSelector("[data-test=\"back-to-products\"]")).click();
	}

	public void order() {
		WebElement Payment_Information = driver.findElement(By.cssSelector("[data-test=payment-info-value]"));
		WebElement Shipping_Information = driver.findElement(By.cssSelector("[data-test=shipping-info-value]"));
		WebElement Price_Total = driver.findElement(By.cssSelector("[data-test=total-label]"));
		
		System.out.println("Payment Information" + Payment_Information.getText());
		System.out.println("SHipping Information" + Shipping_Information.getText());
		System.out.println("Price Total" + Price_Total.getText());

	}
}
