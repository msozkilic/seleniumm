package CalısmaAlanı;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Deneme {
    public static void main(String[] args)  {


    }
    public static WebDriver driver;
    public static void driveriAc(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        Duration duration=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);

    }public static void bekleKapat()  {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);

        }driver.quit();

    }
}
