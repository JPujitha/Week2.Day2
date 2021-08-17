package Week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("home")).click();
driver.navigate().back();
WebElement one=driver.findElement(By.xpath("//label[text()='Find position of button (x,y)']/following-sibling::button"));
System.out.println("Postion is : "+one.getLocation());
WebElement two=driver.findElementById("color");
System.out.println("Color is : "+two.getCssValue("background-color"));
WebElement three=driver.findElementById("size");
System.out.println("Size is : "+three.getSize());
	}

}
