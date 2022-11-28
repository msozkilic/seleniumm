package CalısmaAlanı;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Deneme2 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
        1- https://www.saucedemo.com/ sitesini açınız.
        2- Ekranda görünen usernamleri bir string diziye atınız.
        3- Bu username ve passwordlarını hepsinin login olup olamadığını
        login olduktan sonraki sayfada Products kelimesinin kontrol ederek
        doğrulayınız.
        diğer login kontrolleri için navigate.back kullanınız.
        4- Login olamayan userları ve hata bilgisini yazdırınız.
        List<WebElement> liste=driver.findElements(By.cssSelector("div.login_credentials"));

*/
        driver.navigate().to("https://www.saucedemo.com/");

        // List<WebElement> userNames=driver.findElements(By.id("[id=\"login_credentials\"]"));

        List<WebElement> liste = driver.findElements(By.cssSelector("div.login_credentials"));
        for (WebElement e : liste) {
            System.out.println(e.getText());
        }
        String[] users = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        String sifre = "secret_sauce";

        for (int i = 0; i < users.length; i++) {
            driver.findElement(By.cssSelector("[id=\"user-name\"]")).sendKeys(users.toString());
            for (int j = 0; j < sifre.length(); j++) {
                driver.findElement(By.cssSelector("[id=\"password\"]")).sendKeys(sifre);
                driver.findElement(By.cssSelector("[id=\"login-button\"]")).click();
                System.out.println(users+sifre);
            }

        }
/*
        WebElement usernameButton = driver.findElement(By.cssSelector("[id=user-name]"));
        WebElement passwordButton = driver.findElement(By.cssSelector("[id=password]"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        WebElement productName=driver.findElement(By.xpath("//*[text()=\"Products\"]"));

        String[] userNames={"standard_user","locked_out_user","problem_user","performance_glitch_user"};
        String password="secret_sauce";
        for (int i = 0; i < userNames.length; i++) {
            driver.findElement(By.cssSelector("[id=user-name]")).sendKeys(userNames.toString());
            for (int j = 0; j < userNames.length; j++) {
                driver.findElement(By.cssSelector("[id=password]")).sendKeys(password);
                driver.findElement(By.id("login-button")).click();
                Assert.assertEquals(productName.getText(),"PRODUCTS");
                driver.navigate().back();*/

            }

        }


