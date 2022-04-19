package Alternatives;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Alternative_concepts {

	public static void main(String[] args) throws Throwable {
		
	WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
        
        //Click on Country Dropdown
  
        driver.findElement(By.name("country")).click();
         
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='country']//option"));
        System.out.println(allOptions.size());
         
                 
                 
        for(int i = 0; i<=allOptions.size()-1; i++) {
             
             
            if(allOptions.get(i).getText().contains("ANGOLA")) {
                 
                allOptions.get(i).click();
                break;
                 
		
		
		
		
            }	
		
        }	
		
		
	}
}
