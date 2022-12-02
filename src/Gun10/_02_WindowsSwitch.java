package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/documentation/");

        String anaSayfaWindowId=driver.getWindowHandle();

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link:linkler) {
            if(!link.getAttribute("href").contains("mailto"));
            link.click();
        }
        Set<String> windowsIdler=driver.getWindowHandles();
        for (String id:windowsIdler) {
            if(id.equals(anaSayfaWindowId))continue;
            driver.switchTo().window(id);
            System.out.println(id +"Title "+driver.getTitle());
        }
    }
}
