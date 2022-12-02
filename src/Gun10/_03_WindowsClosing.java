package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
import java.util.List;

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link:linkler) {
            if(!link.getAttribute("href").contains("mailto"))
                link.click();


            driver.quit();

            BekleKapat();

        }

    }
}
