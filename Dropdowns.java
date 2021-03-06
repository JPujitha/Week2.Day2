package Week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drp1=driver.findElementById("dropdown1");
		Select box1=new Select(drp1);
		box1.selectByIndex(1);
		
		WebElement drop2= driver.findElementByName("dropdown2");
		Select box2=new Select(drop2);
		box2.selectByVisibleText("Selenium");
		
		WebElement drop3=driver.findElementById("dropdown3");
		Select box3=new Select(drop3);
		box3.selectByValue("1");
		
		WebElement drop4=driver.findElementByClassName("dropdown");
		Select box4=new Select(drop4);
		System.out.println(box4.getOptions().size());
		
		WebElement drop5=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		drop5.sendKeys("Selenium");
		//drop5.sendKeys(Keys.ENTER);
		
		WebElement drop6=driver.findElementByXPath("//div[@id='contentblock']//div[6]/select");
		drop6.sendKeys("Selenium");
		

	}

}
