package Gün04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));

        System.out.println(sali.isDisplayed());//todo göruyor mu
        System.out.println(sali.isEnabled());//todo aktif mu
        System.out.println(sali.isSelected());//todo secili mu
        bekle(3);

        sali.click();
        bekle(3);
        System.out.println(sali.isSelected());

        BekleKapat();
    }
}
