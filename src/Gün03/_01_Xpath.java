package Gün03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        //WebElement userName1=driver.findElement(By.xpath("//*[text()=\"Accepted usernames are:\"]/.."));
        //userName1.getText();
        WebElement userNameButton=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        userNameButton.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();

        WebElement product1=driver.findElement(By.xpath("//*[text()=\"Sauce Labs Backpack\"]"));
        product1.click();

        WebElement addProduct1=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        addProduct1.click();

        driver.navigate().back();

        WebElement product2=driver.findElement(By.xpath("//*[text()=\"Sauce Labs Bolt T-Shirt\"]"));
        product2.click();

        WebElement addProduct2=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        addProduct2.click();

        WebElement sepet=driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        sepet.click();

        WebElement checkOut=driver.findElement(By.xpath("//*[@id='checkout']"));
        checkOut.click();

        WebElement firstName=driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("Serkan");

        WebElement lastName=driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("kilic");

        WebElement postalCode=driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalCode.sendKeys("5739");

        WebElement continueButton=driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();

        //WebElement productPreis=driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[1]"));
        //productPreis.getText();

        double toplam=0;
        List<WebElement> liste=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
        for (WebElement e:liste) {
            toplam+=Double.parseDouble(e.getText().substring(1));
            System.out.println(toplam);


        }

        WebElement itemTotal=driver.findElement(By.xpath("(//*[@class='summary_subtotal_label'])"));
       double itTot= Double.parseDouble(itemTotal.getText().substring(13));
        System.out.println(itTot);

        if(toplam==itTot)
            System.out.println("test passed");
        else
            System.out.println("test failed");









    }
}
