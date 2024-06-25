package Start;

import org.openqa.selenium.By;


public class CheckOut extends Open {
	String firstname;
	String lastname;
	String zip;
	

   public void checkout(String a, String b,String c) {
	   
	   firstname = a;
	   lastname = b;
	   zip = c;
	   driver.findElement(By.cssSelector("[data-test=\"firstName\"]")).sendKeys(a);
	   driver.findElement(By.cssSelector("[data-test=\"lastName\"]")).sendKeys(b);
	   driver.findElement(By.cssSelector("[data-test=\"postalCode\"]")).sendKeys(c);
	   driver.findElement(By.cssSelector("[data-test=\"continue\"]")).click();

   }
}
