package Gün04;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookIsSelect extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement cookie=driver.findElement(By.cssSelector("button[id^='u_0_e']"));
        cookie.click();
        bekle(2);

        WebElement neuContoErstellen=driver.findElement(By.cssSelector("a[id^='u_']"));
        neuContoErstellen.click();
        bekle(3);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("serkan");

        WebElement lastnameName=driver.findElement(By.name("lastname"));
        lastnameName.sendKeys("kilic");

        WebElement remail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(remail.isDisplayed());

        WebElement mail=driver.findElement(By.cssSelector("name=\"reg_email_\""));
        firstName.sendKeys("serkan@gmail.com");


        Assert.assertTrue(remail.isDisplayed());


        WebElement gunAdi=driver.findElement(By.cssSelector("[id=\"day\"]"));
        Select gun=new Select(gunAdi);
        gun.selectByIndex(18);

        WebElement ayAdi=driver.findElement(By.cssSelector("[id=\"month\"]"));
        Select ay=new Select(ayAdi);
        ay.selectByValue("haziran");

        WebElement yilAdi=driver.findElement(By.cssSelector("[id=\"day\"]"));
        Select yil=new Select(yilAdi);
        yil.selectByIndex(1988);

        WebElement gender=driver.findElement(By.cssSelector("[id="));
        gender.click();







        BekleKapat();
    }
}
