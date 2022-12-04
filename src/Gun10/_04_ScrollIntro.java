package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

public class _04_ScrollIntro extends BaseStaticDriver {
    public static void main(String[] args) {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        //todo sayfayi ilki kadar saga,ikincisi kadar asagi kaydir

        js.executeScript("windowscrollBy(0,-500)");

        BekleKapat();

    }
}
