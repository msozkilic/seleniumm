package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_CssSelector extends BaseStaticDriver {
    public static void main(String[] args) {
       //https:formsmarts.com/form/yu?mode=h5 acin
        //Business i cekleyin     [id='u_smh_4586_0']
        //Discover XYZ tiklatin ve online Advertising secin id=[id*='u_smh_4588']   [id='u_smh_4588']
        //Every day i secin css [id='u_smh_89585_0']
        //Good secin
        //using XYZ TIKLATIN ve 3 secenegi secin
        driver.get("https:formsmarts.com/form/yu?mode=h5");
        bekle(3);
        WebElement business=driver.findElement(By.cssSelector("[id='u_smh_4586_0']"));
        business.click();
        bekle(3);
        WebElement discover=driver.findElement(By.cssSelector("select[id='u_smh_4588']"));
        discover.click();
        bekle(3);
        WebElement advertising=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        advertising.click();
        bekle(3);
        WebElement everyDay=driver.findElement(By.cssSelector("[id='u_smh_89585_0']"));
        everyDay.click();
        bekle(3);
        WebElement good=driver.findElement(By.cssSelector("[id='u_smh_4589_0']"));
        good.click();                               //todo [value='Good'][type='radio']
        WebElement usingXYZ=driver.findElement(By.cssSelector("[id='u_smh_4597']"));
        usingXYZ.click();
        WebElement ucuncu= driver.findElement(By.cssSelector("[id='u_smh_4597']"));
        ucuncu.click();                                //todo [id='u_v4c_4597']> :nth-child(4)

        BekleKapat();
    }
}
