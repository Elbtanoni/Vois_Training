package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Shoping extends Login {

	WebElement p1 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-backpack\"]"));
	WebElement p2 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-bike-light\"]"));
	WebElement p3 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
	WebElement p4 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
	WebElement p5 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-onesie\"]"));
	WebElement p6 = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
	
	public void select(int a,int b,int c,int d,int e,int f) {
		
		int i =1;
			if (i==a) {
				p1.click();}
			if (i==b)	{
				p2.click();}
			if (i==c) {
				p3.click();}
			if (i==d) {
				p4.click();}
			if (i==e) {
				p5.click();}
			if (i==f) {
				p6.click();}
			driver.findElement(By.cssSelector("[data-test=\"shopping-cart-link\"]")).click();
			driver.findElement(By.cssSelector("[data-test=\"checkout\"]")).click();
			}
	
		}
