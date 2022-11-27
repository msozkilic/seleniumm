package CalısmaAlanı;
import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Deneme extends BaseStaticDriver {
    public static void main(String[] args) {

     /*   Senaryo
        1-https://www.saucedemo.com/ sitesini aciniz
        2-Login islemi yapiniz
        3-Buradaki urunlerin isimlerini ekrana yazdirinuz*/
        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("problem_user");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();

        List<WebElement>product=driver.findElements(By.className("inventory_container"));
        for (WebElement e:product
        ) {
            System.out.println(e.getText());

        }

        /*List<WebElement>product=driver.findElements(By.id("inventory_list"));
        for (WebElement e:product
             ) {
            System.out.println(e.getText());

        }*/




    }

    }

