package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPart3 extends BaseStaticDriver {
    public class AlertPart2 extends BaseStaticDriver {
        public static void main(String[] args) {
            driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

            WebElement ClickMe1 = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
            ClickMe1.click();
            bekle(2);

            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().sendKeys("serkan");
            bekle(3);
            driver.switchTo().alert().accept();
            bekle(3);

            WebElement txtActual = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));

            Assert.assertTrue(txtActual.getText().contains("serkan"));
            BekleKapat();

        }
    }
}
