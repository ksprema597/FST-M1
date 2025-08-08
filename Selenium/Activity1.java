package activvities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.get("https://training-support.net/");
	 System.out.println("Page is " +driver.getTitle());
	 //Find and click the About us button 
	 driver.findElement(By.linkText("About Us")).click();
	 System.out.println("Title is " +driver.getTitle());
	 }
}

