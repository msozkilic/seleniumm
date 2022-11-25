package Gun01;

import Utils.BaseStaticDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SendText extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/");

        WebElement giris=driver.findElement(By.className("dropdown-toggle"));
        giris.click();

        WebElement inputbtn=driver.findElement(By.linkText("Simple Form Demo"));
        inputbtn.click();

        WebElement txtBox=driver.findElement(By.id("user-message"));
        txtBox.sendKeys("merhaba selenium");

        WebElement btn=driver.findElement(By.className("btn-default"));
        btn.click();

        WebElement msg=driver.findElement(By.id("display"));
        if(msg.getText().contains("merhaba selenium"))
            System.out.println("test passed");
        else
            System.out.println("test failed");



        BekleKapat();
    }
}
