package Alternatives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setproperty {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.close();
	}
	
	
	
	
	
	
}
