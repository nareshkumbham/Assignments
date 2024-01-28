package mylove;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Seleneium\\New folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("nareshacadamy");
		driver.findElement(By.name("email")).sendKeys("nareshgoud857@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nani@555");
		driver.findElement(By.id("exampleCheck1")).click(); 
		WebElement drop = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select dropDown = new Select(drop);
	    dropDown.selectByIndex(0);
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("08/20/2000");
	    
	    driver.findElement(By.cssSelector("input.btn.btn-success")).click();
	    
	    System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	    
	   
	
		
	}
	
}
