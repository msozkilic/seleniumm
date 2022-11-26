package Gün03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath extends BaseStaticDriver {
    public static void main(String[] args)  {
       //https://saucedemo.com/ sitesini acin
        //login
        //Sauce labs Backpack a tiklatin ve sepete ekletin
        //Geri donu
        //Sacue labs Bolt tshirt a tiklatin ve sepete ekleyin
        //sepete tiklatin
        //checkout a tiklatin
        //kkullanici bilgilerini doldurup continue ya tiklatin
        //burada her beri esyanin ücretlerinin toplaminin asagidaki tem titale esit olup olmadinihn assert ile test edin

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://saucedemo.com/");


        BekleKapat();
    }
}
