package CalısmaAlanı;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Deneme5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("www.google.com");


        WebElement name=driver.findElement(By.id("id"));

        //TODO ALERT
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("id");

        //TODO PAGE SETTINGS
        driver.manage().deleteAllCookies();
        driver.manage().deleteAllCookies();
        // TODO IMPLICHT WAIT
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.getCurrentUrl();

        driver.close();
        driver.quit();

        //TODO EXCPLICHT WAIT
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.alertIsPresent());
        wait1.until(ExpectedConditions.textToBe(By.id("idd"),"Bekliyoruz"));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("idd")));

        //TODO SELECT CLASSES
        WebElement element=driver.findElement(By.className("ak"));
        Select select=new Select(element);
        select.selectByVisibleText("al");
        select.selectByIndex(5);
        select.selectByValue("ah");

        WebElement element1=driver.findElement(By.id("idd"));
        System.out.println(element1.getAttribute("name"));
        System.out.printf(element1.getAttribute("id"));
        System.out.printf(element1.getAttribute("class"));

        //TODO ACTION CLASSSES
        WebElement element2=driver.findElement(By.id("iddd"));
        Actions aksiyonlar=new Actions(driver);
        aksiyonlar.click();
        aksiyonlar.clickAndHold();
        aksiyonlar.doubleClick();
        aksiyonlar.contextClick();
        aksiyonlar.moveToElement(element2).click();
        aksiyonlar.moveToElement(element2).sendKeys("hayir");
        aksiyonlar.moveToElement(element2).dragAndDrop(element2,element1);
        aksiyonlar.moveToElement(element2).keyDown(Keys.SHIFT).keyDown(Keys.ENTER);
        aksiyonlar.moveToElement(element2).scrollToElement(element);
        aksiyonlar.moveToElement(element2).scrollByAmount(100,0);
        aksiyonlar.release();
        aksiyonlar.build();
        aksiyonlar.perform();


    }
}
