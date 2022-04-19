package Com.Automation_practice;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner_class {
public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Driver 1\\chromedriver.exe");
		
	        	WebDriver driver = new ChromeDriver();
	                    driver.get("http://automationpractice.com/index.php");
		     driver.manage().window().maximize();
		        WebElement Sg =driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
	                                      Sg.click();
	                         JavascriptExecutor js = (JavascriptExecutor)driver;	                              		
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	                              	  		
	  js.executeScript("window.scrollBy(0,400);"); 
	 //mail id
	         WebElement Em = driver.findElement(By.id("email"));	                                   
	                                    Em .sendKeys("It's_ME_BABY_8_@gmail.com");
	 //password                                   
	          WebElement Ps =  driver.findElement(By.id("passwd"));
	                                     Ps.sendKeys("12345");
	//sign in                                     
	          WebElement S = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
	                                      S.click();     
	//womens click                                      
	          WebElement CK = driver.findElement(By.xpath("//a[@title='Women']"));                        
	   		                             CK.click();		
	  js.executeScript("window.scrollBy(0,900)");
	  
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 	   	
	 	  Actions act = new Actions(driver);	
	 //tshirt	  
	 	// js.executeScript("window.scrollBy(0,500)");
	   	      WebElement  open =driver.findElement(By.xpath("(//a[normalize-space()='Printed Dress'])[2]"));
	   	                          act.click(open).build().perform();  	   	                          
	 //Quantity  	   
	   	                       js.executeScript("window.scrollBy(0,500)");
	   	                       
	   	               driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	   	               
	                          //     driver.switchTo().parentFrame();
	                                
	   	      WebElement P = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
	   	                            act.click(P).build().perform();
	 //size  	                            
	   	      WebElement m = driver.findElement(By.id("group_1")) ;
	   	      Select select2 = new Select(m);
	   	          select2.selectByVisibleText("L");                  
	 //colour
	   	          WebElement c = driver.findElement(By.name("Pink"));
	   	              c.click();              
	   	                                                     
	   	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	//submit
	   		  WebElement Ac =driver.findElement(By.name("Submit"));
	   		                      Ac.click();
	   		                      
	           Actions a= new Actions(driver);	                       
	                      	WebDriverWait wait = new WebDriverWait(driver,20);     		
	   		                   // driver.switchTo().parentFrame();
	//Proceed to check out   		                       
	     	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))));
	   		                      // driver.switchTo().parentFrame();
	//summary   		                       
	   		 a.click(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))).build().perform();
	   		 
                      js.executeScript("window.scrollBy(0,800)");  
   //signin
              a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
                    
                        js.executeScript("window.scrollBy(0,800)");  
    //address
                         WebElement e = driver.findElement(By.name("message"));
                                    e.sendKeys("stylemesaloon opp"); 
     //shipping                               
	           a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
	  
                        js.executeScript("window.scrollBy(0,800)");  
  //terms of serivce
	                    WebElement R =driver.findElement(By.id("cgv")); 
	   		                             R.click();
 //payment	   		                       
	   		   a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
                           js.executeScript("window.scrollBy(0,400)");   
                                     // ScreenShot
    
                        TakesScreenshot Ts = (TakesScreenshot)driver;
                          File Src = Ts.getScreenshotAs(OutputType.FILE);
                          File Des = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Screenshot/Payment.png");
                          FileUtils.copyFile(Src, Des);
                          
       //pay by cheaqe                   
                      js.executeScript("window.scrollBy(0,400)");                    
                   WebElement Pay = driver.findElement(By.xpath("//a[@class='cheque']"));
                      Pay.click();
                          
                          js.executeScript("window.scrollBy(0,400)");                        
      // i conform my order
                          WebElement I = driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));
                                    I.click();
                          
                     js.executeScript("window.scrollBy(0,400)");         
                          
                          //screenshot
                          
                     TakesScreenshot T = (TakesScreenshot)driver;
                     File Sr = Ts.getScreenshotAs(OutputType.FILE);
                     File D = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Screenshot/orderconform.png");
                     FileUtils.copyFile(Sr, D);
                          
              //sign out 
                     WebElement Sgout = driver.findElement(By.xpath("(//a[normalize-space()='Sign out'])[1]"));
                                 Sgout.click();
                          
                          
                          
                          
                          
                          
                          
                          
  
    }
  
}  
  
  
  
  
  

