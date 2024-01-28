package mylove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Seleneium\\New folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();      
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();        
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println( driver.findElement(By.id("content")).getText());
       // System.out.println(driver.findElements(By.tagName("a")).size());
        //String clicklink=Keys.chord(keys.control,keys.enter); to click on multiple links      
	}

}
