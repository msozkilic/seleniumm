package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        bekle(2);

        WebElement element=driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar=new Actions(driver);
        Action action=aksiyonlar.moveToElement(element).contextClick().build();
        action.perform();

    }
}
