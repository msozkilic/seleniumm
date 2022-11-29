package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActionCountry extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> cities = driver.findElements(By.cssSelector("[id=dropContent]"));
        List<WebElement> countries = driver.findElements(By.cssSelector("[id='countries']"));
        Actions aksiyonlar = new Actions(driver);

        int count = 0;
        int i = 0;
        if (countries.get(i).getCssValue("color") == "green")
            for (i = 0; i < cities.size(); i++) {
                for (int j = 0; j < countries.size(); j++) {
                    aksiyonlar.dragAndDrop(cities.get(i), countries.get(i));
                    count++;
                    break;
                }
                System.out.println();
            }

BekleKapat();
    }

        }

