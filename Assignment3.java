package mylove;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Seleneium\\New folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(3000));
        
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        //driver.switchTo().alert().accept();
        
        WebElement dropDown = driver.findElement(By.cssSelector("select.form-control"));
        Select s =new Select(dropDown);
        s.selectByValue("consult");
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
        
        List <WebElement> count = driver.findElements(By.cssSelector("button.btn.btn-info"));
        
        for(int i=0;i<count.size();i++) {
        	
        	count.get(i).click();

        	
        }
       driver.findElement(By.partialLinkText("Checkout")).click();
        
       
       
        
        
        
        

	}

}
