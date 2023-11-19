import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.manage().window().maximize();
    }
}
