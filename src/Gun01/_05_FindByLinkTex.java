package Gun01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindByLinkTex extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        WebElement element=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(element.getText());

        System.out.println(element.getAttribute("title"));
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("rel"));

        WebElement element2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println(element.getText());


        BekleKapat();
    }
}
