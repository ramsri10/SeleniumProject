import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivsrira\\Desktop\\Office\\IDE\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2F&locale=en_GB&display=page");
         WebElement element=driver.findElement(By.name("firstname"));
         element.sendKeys("Sriram");

         element.findElement(By.name("lastname"));
         element.sendKeys("Sivakumar");

    }
}


