

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {
    @Test
    public void testOne () {

        System.setProperty("webdriver.chrome.driver","src/drivers/win32/chromedriver80/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");

        driver.quit();


    }



}
