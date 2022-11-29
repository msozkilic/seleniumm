package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));


        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon öncesi siniflar olusturuldu");
        Action action=aksiyonlar.moveToElement(element).click().build();
        System.out.println("Aksiyon hazirlandi");

        action.perform();
        System.out.println("Aksiyon gerceklesti");

        BekleKapat();
    }
}
