package Gün03;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com/");

        WebElement menu=driver.findElement(By.id("searchDropdownBox"));
        Select dropdownMenu=new Select(menu);
        dropdownMenu.selectByVisibleText("Bilgisayarlar");

        WebElement srcButton= driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();

        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));

        BekleKapat();
    }
}
