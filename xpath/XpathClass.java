package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\DayTwoClassXpath\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
//		Xpath method :
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manikandan");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mani@123");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
//		Text contains Method :
		
//		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
//		String text2 = text.getText();
//		System.out.println(text2);
		
//		GetAttribute Method :
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("manikandan");
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("mani@123");
		String attribute2 = password.getAttribute("value");
		System.out.println(attribute2);
		driver.findElement(By.name("login")).click();
		
		
		driver.close();
	}

}
