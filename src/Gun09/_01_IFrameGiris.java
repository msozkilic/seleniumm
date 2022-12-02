package Gun09;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input=driver.findElement(By.cssSelector("b[id='topic']~input"));

        driver.switchTo().parentFrame();  //todo bir kere geri dönebilirsin
        driver.switchTo().defaultContent();//todo direkt ana sayfaya dönersin

        BekleKapat();
    }
}
