package mylove;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Seleneium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(); 
        driver.manage().window().maximize();       
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elemntsList=driver.findElements(By.xpath("//tr/td[1]"));
       List<String> originallist= elemntsList.stream().map(s->s.getText()).collect(Collectors.toList());
       
       List<String>sortList=originallist.stream().sorted().collect(Collectors.toList());
      // Assert.assertTrue(originallist.equals((sortList)));
      
     List<String>price= elemntsList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
     
     price.forEach(a->System.out.println(a));
        
	}

	

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return priceValue;
	}

}
