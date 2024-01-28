package mylove;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Seleneium\\New folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(); 
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize(); 
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
      Set<String> store= driver.getWindowHandles(); 
      
      Iterator<String> it =store.iterator();
      
      String parentWindow =it.next();
      
     driver.switchTo().window(it.next());
     System.out.println(driver.findElement(By.xpath("//div/h3")).getText());//print from child window
     driver.switchTo().window(parentWindow);
     System.out.println(driver.findElement(By.xpath("//div/h3")).getText());//print from parent window
     
	}
}
      
