package Week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//div[@class='example']//input[1]").click();
		WebElement Box1 = driver.findElementByXPath("(//div[@class='example'])[2]//input");
		if (Box1.isSelected()) {
			System.out.println("Selenium is checked");
		}
		else {
			System.out.println("Selenium is not checked");
		}
		driver.findElementByXPath("(//div[@class='example'])[3]//div[2]/input").click();
		driver.findElementByXPath("(//div[@class='example'])[4]/div[1]/input").click();
		driver.findElementByXPath("(//div[@class='example'])[4]/div[2]/input").click();
		driver.findElementByXPath("(//div[@class='example'])[4]/div[3]/input").click();
		driver.findElementByXPath("(//div[@class='example'])[4]/div[4]/input").click();
		driver.findElementByXPath("(//div[@class='example'])[4]/div[5]/input").click();
		
		}
	}


