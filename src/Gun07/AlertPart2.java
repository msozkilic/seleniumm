package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe1=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        ClickMe1.click();
        bekle(5);

        driver.switchTo().alert().dismiss();
        BekleKapat();

    }
}
