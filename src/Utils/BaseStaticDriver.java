package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.security.PublicKey;
import java.time.Duration;

public class BaseStaticDriver {

    public static WebDriver driver;

    static {// todo public static void DriverBaslat() normalde boyleydi bu method ,boyle yazinca her zaman calisir
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();// todo site seleniumdan geldigini anlayip cooki atiyor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }
    public static void BekleKapat(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
