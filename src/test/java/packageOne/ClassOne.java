package packageOne;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  @Test
  public void testOne(){
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.omayo.blogspot.com");
	  driver.findElement(By.linkText("XYZ")).click();
  }
  

}
