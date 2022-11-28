package Gün04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCSSValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValueEnter=driver.findElement(By.id("inputValEnter"));

        System.out.println(inputValueEnter.getAttribute("name"));
        System.out.println(inputValueEnter.getAttribute("type"));
        System.out.println(inputValueEnter.getAttribute("class"));

        System.out.println(inputValueEnter.getCssValue("color"));
        System.out.println(inputValueEnter.getCssValue("background"));
        System.out.println(inputValueEnter.getCssValue("font-size"));
        System.out.println(inputValueEnter.getCssValue("height"));

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase/.html#!CwCheckBox");
        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));

        System.out.println(sali.isDisplayed());//todo göruyor mu
        System.out.println(sali.isEnabled());//todo aktif mu
        System.out.println(sali.isSelected());//todo secili mu



        BekleKapat();
    }
}
