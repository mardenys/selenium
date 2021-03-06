import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestElement {

    @Test
    public void elements () {

        System.setProperty("webdriver.chrome.driver","src/drivers/win32/chromedriver80/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://oferia.pl/moja_oferia");

        driver.findElement(By.id("login_login")).sendKeys("test");
        driver.findElement(By.id("login_password")).sendKeys("test");
        driver.findElement(By.cssSelector(".btn-submit")).click();

        String actualResult = driver.getCurrentUrl().equals("https://oferia.pl/moja_oferia/zlecam/moje_zlecenia/aktywne/1/0/0/1") ? "passed" : "failed";
        System.out.println("The Test " + actualResult);


        driver.close();
    }

}
