package FB;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import baseclass.Base;

public class facebook extends Base{

	@BeforeClass
	public static void launching()
	{
		launch();

	}
	@Test
	public void tc1()
	{
		//System.out.println("hi");
	url("https://www.facebook.com/");
		max();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8870598421");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("9994715321");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}
	@AfterClass
	public static void over() {
		closing();
	}

	}


