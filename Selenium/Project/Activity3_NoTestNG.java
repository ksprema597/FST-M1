package examples;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_NoTestNG {
    public static void main(String[] args) {
        // Set the path to geckodriver if not in PATH
        // System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");

        // Create a new FirefoxDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open the OrangeHRM login page
            driver.get("http://alchemy.hguy.co/orangehrm");

            // Wait for the page to load (optional but recommended)
            Thread.sleep(2000);

            // Find the Username and Password fields
            WebElement txtUsername = driver.findElement(By.id("txtUsername"));
            WebElement txtPassword = driver.findElement(By.id("txtPassword"));

            // Enter credentials
            txtUsername.sendKeys("orange");
            txtPassword.sendKeys("orangepassword123");

            // Click the Login button
            driver.findElement(By.id("btnLogin")).click();

            // Optional wait to observe result
            Thread.sleep(2000);

            // Optionally verify login success by checking presence of an element (e.g., Dashboard)
            boolean dashboardExists = driver.findElement(By.id("menu_dashboard_index")).isDisplayed();

            if (dashboardExists) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
