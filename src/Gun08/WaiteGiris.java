package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WaiteGiris extends BaseStaticDriver {
    public static void main(String[] args) {
       driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.cssSelector("onclick='timedText()'"));
        btn.click();

        BekleKapat();

    }
}
