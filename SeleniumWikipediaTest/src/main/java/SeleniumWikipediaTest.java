import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWikipediaTest {
    public static void main(String[] args) {
        // Set the path to chromedriver.exe (update this path if needed)
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Wikipedia
            driver.get("https://www.wikipedia.org");

            // Get and print page title
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            // Check title contains 'Wikipedia'
            if (title.contains("Wikipedia")) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed!");
                System.exit(1); // Fail the job
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            driver.quit();
        }
    }
}
