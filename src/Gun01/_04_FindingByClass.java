package Gun01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_FindingByClass extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-submit-button submit-button jf-form-buttons jsTest-submitField"));
        System.out.println(element.getText());            //form-submit-button submit-button jf-form-buttons jsTest-submitField

        WebElement element2=driver.findElement(By.className("form-textbox validate[required]"));
        System.out.println(element2.getText());            //form-textbox validate[required]

        List<WebElement> liste=driver.findElements(By.className("form-textbox validate[required]"));
        System.out.println("liste.size "+ liste.size());
        for (WebElement e:liste
        ) {
            System.out.println("e.getTex"+e.getText());

        }






        BekleKapat();
    }


}
