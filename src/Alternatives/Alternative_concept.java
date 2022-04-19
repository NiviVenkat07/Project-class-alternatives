package Alternatives;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternative_concept {

public static void main(String args[]) throws AWTException {   
		 
	    //Environment setup Created for System.setproperty 
	
         WebDriver driver = new ChromeDriver();
         
        // Alternative for Get method
         
	    driver.navigate().to("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    // Alternative for Sendkeys
	    
	    WebElement E =driver.findElement(By.id("email"));
	    js.executeScript("arguments[0].value='nivivenkat';",E);
	    
	
	    // Alternative for click method  
	    	     	     
	 	WebElement C= driver.findElement(By.name("login"));  
	    js.executeScript("arguments[0].click();",C);
	       
	    
	     // Alternative for Refresh method 
	     
	     Robot r =new Robot();
	   	      
	    r.keyPress(KeyEvent.VK_F5);
	  
	   
	     driver.quit();
	     
}
}