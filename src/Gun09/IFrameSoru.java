package Gun09;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input=driver.findElement(By.cssSelector("b[id=\"topic\"]~input"));
        input.sendKeys("Türkiye");


        driver.switchTo().frame(0);
        WebElement chechkButton=driver.findElement(By.cssSelector("[id=\"a\"]"));
        chechkButton.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animals=driver.findElement(By.id("[id=\"animals\"]"));
        Select select=new Select(animals);
        //select.selectByIndex(select.getOptions().size()-1);
        select.selectByVisibleText("Avatar");
        //select.selectByIndex(3);


    }
}
