package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.cssSelector("[id='title']"));
        name.sendKeys("serkan");

        WebElement comment=driver.findElement(By.cssSelector("[id='description'"));
        comment.sendKeys("merhaba");

        WebElement submit=driver.findElement(By.cssSelector("[id=\"btn-submit\"]"));
        submit.click();


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Succesfully"));

        WebElement sonYazi=driver.findElement(By.cssSelector("[id='submit-control']"));


        Assert.assertEquals("Form submited Succesfully!",sonYazi.getText());

        BekleKapat();

    }
}
