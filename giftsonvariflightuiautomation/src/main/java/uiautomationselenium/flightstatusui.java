package uiautomationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flightstatusui {

	public static void main(String[] args) throws InterruptedException {
				  
		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://www.variflight.com/en/");
        driver.findElement(By.xpath("//div[@class='layerclose']")).click();
        Thread.sleep(1000);
       WebElement flightid = driver.findElement(By.xpath("//input[@id='search-flight-num']"));
       flightid.sendKeys("SQ5905");
      
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn-sure searchBtn']")).click();
        
        
    }
}
