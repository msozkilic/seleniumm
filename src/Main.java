import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techno.study/");

        Thread.sleep(3000);
        driver.quit();


}}