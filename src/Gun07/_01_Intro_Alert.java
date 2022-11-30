package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Intro_Alert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe1=driver.findElement(By.cssSelector("[class='btn btn-default']"));
        ClickMe1.click();
        bekle(2);

        driver.switchTo().alert().accept();


BekleKapat();

    }
}
