package Dynamic_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Driver 1\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
               driver.get("https://www.myntra.com/dress");
		      driver.manage().window().maximize();
		      
		 List <WebElement> price= driver.findElements(By.xpath("//span[@class='product-discountedPrice']//following-sibling :: span"));
		             for (WebElement productprice : price) {
						
		            	String text = productprice.getText();
		            	 
		            	 System.out.println();
					}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
