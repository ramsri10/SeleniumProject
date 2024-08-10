import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivsrira\\Desktop\\Office\\IDE\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//topcasting driver is a greatparent cls of chrome driver
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("The Title of the page is:" + title);

        if (title.equals("Google")) {//validation points
            System.out.println("Pass");
        } else
            System.out.println("Fails");
         driver.quit();
    }

}
