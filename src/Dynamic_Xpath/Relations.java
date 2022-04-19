package Dynamic_Xpath;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relations {
 public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
			
	//  Grand child
	       System.err.println(" Descendant");         
	
	      WebElement oppo = driver.findElement(By.xpath("//div[@class='a-section a-spacing-large']"
	      		+ "//descendant :: div[@class='a-section a-spacing-none gw-card-layout']"));   
	              System.out.println(oppo.getText());
	    
   //  following-siblings   
	
	              System.err.println("Following - sibling");
	              
	  WebElement price = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small']"
	  		+ "//following-sibling :: div[@class='a-section _deals-shoveler-v2_style_dealInfo__1U5R1']"));
	              System.out.println(price.getText());
	
   // preceding -siblings	
	              
	         System.err.println("Preceding - siblings");  
	    
         WebElement min_max_price = driver.findElement(By.xpath("//span[@class='a-price max-deal-price']"
 		                    + "//preceding-sibling :: span[@class='a-price min-deal-price']"));
	                
						System.out.println(min_max_price.getText());
	                                          				
	// grand parent
						
				System.err.println("Ancestor");		
						
        WebElement list = driver.findElement(By.xpath("//span[@class='dealAvailabilityMessage _deals-shoveler-v2_style_dealTimer__3sQxX']"
  		                                                    + "//ancestor :: span[@class='a-list-item']"));   		               
                   
					System.out.println(list.getText());
				
      //child
                System.err.println("Child");
                    
  WebElement child = driver.findElement(By.xpath("//span[@class='a-price-whole']//child::span[@class='a-price-decimal']"));
	             	    System.out.println(child.getText());

	 // parent 

                System.err.println("parent");
					    
	    WebElement P = driver.findElement(By.xpath("//span[@class='a-price-decimal']//parent ::span[@class='a-price-whole']"));
	                System.out.println(P.getText());
	    
	    
	    
 }   
 }	    
 
