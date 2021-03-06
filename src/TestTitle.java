import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTitle {


    @Test
    public void  outputTitle() {

        System.setProperty("webdriver.chrome.driver","src/drivers/win32/chromedriver80/chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        driver.get("https://gmail.com");
        String currentTitle = driver.getTitle();

        System.out.println("Title " + currentTitle);
        driver.close();



    }
}
