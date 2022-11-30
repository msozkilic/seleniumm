package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class YönTuslariSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=

        aksiyonlar.moveToElement(element)
                .click()
                .sendKeys("b")
                .build();
        aksiyonlar.perform();
        bekle(2);
        aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();


        BekleKapat();


    }
}
