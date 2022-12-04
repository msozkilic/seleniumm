package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        driver.switchTo().frame(8);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptAll=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=''")));
        acceptAll.click();
        driver.switchTo().defaultContent();

        Robot rbt=new Robot();

        for (int i = 0; i <= 13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); //todo tusa basildi
            rbt.keyRelease(KeyEvent.VK_TAB);//todo tus birakildi.
        }
        rbt.keyPress(KeyEvent.VK_ENTER); //todo tusa basildi
        rbt.keyRelease(KeyEvent.VK_ENTER);//todo tus birakildi.

        BekleKapat();
    }
}
