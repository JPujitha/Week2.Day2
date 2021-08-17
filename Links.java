package Week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.operator.AADProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Go to Home Page").click();
		String url=driver.getCurrentUrl();
		driver.navigate().back();
		
		WebElement link=driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		System.out.println(link.getAttribute("href"));
		
		driver.findElementByLinkText("Verify am I broken?").click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.findElementByLinkText("Go to Home Page").click();
		String Url=driver.getCurrentUrl();
		if (url.equals(Url)) {
			System.out.println("Both links are same");	
		}
		driver.navigate().back();
		
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
        // count no of links on page
        System.out.println("Number of links on Web Page :" +numberOfLinks );
		
	}
}
