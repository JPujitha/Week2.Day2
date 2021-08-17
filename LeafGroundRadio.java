package Week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("yes").click();
		WebElement t=driver.findElementByXPath("(//input[@name=\"news\"])[2]");
		if (t.isSelected()) {
			System.out.println("Default button selected is Checked");	
		}
		WebElement t1 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]");
		if (t1.isSelected() == false) {
			t1.click();
		}
		else {
			System.out.println("Age group is selected");
		}

	}

}
