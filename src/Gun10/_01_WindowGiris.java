package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static io.netty.util.internal.SystemPropertyUtil.contains;

public class _01_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/documentation/");

        List<WebElement> linlkler = driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link : linlkler) {
            if(link.getAttribute("href").contains("mailto"))
                link.click();
                BekleKapat();
        }

        }
    }

