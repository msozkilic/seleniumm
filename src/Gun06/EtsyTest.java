package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class EtsyTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/de");
        bekle(2);

        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("button[class=\"wt-btn wt-btn--filled wt-mb-xs-0\"]"));
        if(cookiesAccept.size()>0)
        cookiesAccept.get(0).click();
        bekle(2);

        WebElement shcmuckButton = driver.findElement(By.cssSelector("span[id=\"catnav-primary-link-10855\"]"));
        WebElement ketten = driver.findElement(By.cssSelector("span[id$=\"0873\"]"));
        WebElement halsKette = driver.findElement(By.id("catnav-l3-10881"));

        elemanaGit(shcmuckButton);
        elemanaGit(ketten);
        elemanaGitClick(halsKette);
        bekle(5);

        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains("bib"));

        BekleKapat();
    }public static void elemanaGit(WebElement element) {
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).build();
        aksiyon.perform();
        bekle(2);
    }
    public static void elemanaGitClick(WebElement element) {
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        aksiyon.perform();
    }
}
