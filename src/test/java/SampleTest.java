import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleTest {

    @Test
    public static void firstTestcase(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       String title = driver.getTitle();
      Assert.assertEquals(title,"DEMOQA");
      driver.quit();

    }
}
