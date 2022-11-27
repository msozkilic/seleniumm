package Gün03;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectEbay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");

        WebElement menu=driver.findElement(By.cssSelector("[id=gh-cat]"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByValue("625");

        WebElement searc=driver.findElement(By.id("gh-btn"));
        searc.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();



    }
}
