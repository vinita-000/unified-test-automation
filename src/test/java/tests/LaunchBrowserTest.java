package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {

    @Test
    void launch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println("Page Title is :" + driver.getTitle());
        driver.quit();
    }
}
