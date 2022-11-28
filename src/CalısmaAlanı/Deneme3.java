package CalısmaAlanı;
import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
/*
Senaryo:
1- https://www.saucedemo.com/ sitesine gidiniz.
2- Login olunuz.
3- Bütün ürünlerin isimlerini bir yerde tutunuz.
4- Bütün ürünleri sepete atınız.
5- Sepete tıklayınız.
6- Sepetteki ürünlerle , ilk başta aldığını ürünlerin listesi
   birebir aynı olup olmadığını kontrol ediniz.
*/
public class Deneme3 extends BaseStaticDriver {
    public static void main(String[] args) {

        //todo Siteye gidildi
        driver.get("https://www.saucedemo.com/");

        //todo LOGIN ISLEMLERI YAPILDI
        WebElement usernameButton=driver.findElement(By.cssSelector("#user-name"));
       usernameButton.sendKeys("standard_user");
       WebElement passwordButton=driver.findElement(By.cssSelector("#password"));
       passwordButton.sendKeys("secret_sauce");
       WebElement loginButton=driver.findElement(By.cssSelector("#login-button"));
       loginButton.click();

       //TODO URUN ISIMLERINI BIR ARAYA ALDIK
       List<WebElement> product=driver.findElements(By.xpath("//div[@class='inventory_item_name'])"));
       List<String> urunAdlari=new ArrayList<>();
        for (WebElement e:product) {
            urunAdlari.add(e.getText());
        }
        //TODO URUNLERI SEPETE EKLEDIK
        List<WebElement> addToChartButton=driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        for (WebElement e:addToChartButton
             ) {
            e.click();
        }
        //TODO SEPETE GITTIK
        WebElement sepet=  driver.findElement(By.cssSelector("[class=shopping_cart_link]"));
        sepet.click();

        //TODO SEPETTEKI URUNLERLE ILK BASTAKI URUNLERIN KARSILASTIRILMASI
        List<WebElement>sepettekiUrunler=driver.findElements(By.cssSelector("div[class=inventory_item_name]"));
        List<String>sonUrunler=new ArrayList<>();
        for (WebElement urun:sepettekiUrunler) {
            sonUrunler.add(urun.getText());
        }
        for (int i = 0; i < sepettekiUrunler.size(); i++) {
            if(!sonUrunler.get(i).equals(urunAdlari.get(i)));
            Assert.fail("urun adlari esit degil "+sonUrunler.get(i)+urunAdlari.get(i));

        }
           Assert.assertEquals(urunAdlari,sonUrunler);





        BekleKapat();
        }

    }

