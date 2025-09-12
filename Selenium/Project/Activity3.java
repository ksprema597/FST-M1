package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        // Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }

    @Test
    public void loginTest() {
        // Find the Username and password fields
    	WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));

        // Enter credentials
        txtUsername.sendKeys("orange");
        txtPassword.sendKeys("orangepassword123");
        // Click login
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
    }

        

    @AfterClass
    public void afterClass() {
        // Close browser
        driver.close();
    }
}