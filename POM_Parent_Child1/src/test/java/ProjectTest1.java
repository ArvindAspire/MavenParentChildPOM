import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectTest1 {
   public WebDriver driver;

   @Test
    public void googleTitle(){

      driver= new ChromeDriver();
      driver.get("https://www.google.com");
       System.out.println(driver.getTitle());
       driver.quit();
   }

}
