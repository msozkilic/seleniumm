package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClick extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        bekle(2);

        WebElement element=driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));

        Actions aksiyonlar=new Actions(driver);
        Action action=aksiyonlar.moveToElement(element).doubleClick().build();
        action.perform();
        bekle(2);

        BekleKapat();



    }
}
