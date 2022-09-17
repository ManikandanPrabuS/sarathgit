package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomMethod {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\DayTwoClassXpath\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),' Selenium is')]"));
		String text2 = text.getText();
		System.out.println(text2);
	}

}
