package Gun01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        bekle(2);
        WebElement element= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        bekle(2);

        driver.navigate().back();
        bekle(2);

        driver.navigate().forward();

        BekleKapat();
    }
}
