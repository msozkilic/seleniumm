package Gun11;

import Utils.BaseStaticDriver;
import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Start extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException, IOException {
        driver.get("https://www.n11.com/");
        driver.manage().deleteAllCookies();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement accept=driver.findElement(By.cssSelector("[class=\"dn-slide-accept-btn\"]"));
        accept.click();

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        //robot.keyPress(KeyEvent.VK_TAB);
        //robot.keyPress(KeyEvent.VK_TAB);


        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        wait.until(ExpectedConditions.urlContains("n11"));


        System.out.println("sayfanin adi :"+driver.getCurrentUrl());
        System.out.println("sayfanin idsi :"+driver.getWindowHandle());

        WebElement adresButton=driver.findElement(By.cssSelector("[class=\"menuLink pin\"]"));
        adresButton.click();

        WebElement sehir=driver.findElement(By.cssSelector("[id=\"headerMyLocationCityId\"]"));
        Select select=new Select(sehir);
        select.selectByValue("2506");

        WebElement ilce=driver.findElement(By.cssSelector(" [id=\"headerMyLocationDistrictId\"]"));
        Select select1=new Select(ilce);
        select1.selectByVisibleText("Kazan");

        WebElement konum=driver.findElement(By.xpath("//*[text()=\"Konum Seç\"]"));
        wait.until(ExpectedConditions.visibilityOf(konum));
        konum.click();

        TakesScreenshot ts=(TakesScreenshot) driver;
        File görüntü=ts.getScreenshotAs(OutputType.FILE);
        Files.move(görüntü,new File("ekranGörüntüleri/n11.png"));

        TakesScreenshot ts2=(TakesScreenshot) driver;
        File görüntü2=ts2.getScreenshotAs(OutputType.FILE);
        Files.move(görüntü2,new File("ekranGörüntüleri/n11.2.png"));

        StringSelection stringSelection=new StringSelection();


        // screenshot alan method
        /*static void getScreenshot(){
            String directoryPath = "screenShots/resimler/";
            File directory = new File(directoryPath);
            if (!directory.exists()) {
                directory.mkdir();
            }

            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss"));
            String filePath = directoryPath + Thread.currentThread().getName() + "_" + dt + ".png";
            try {
                FileUtils.copyFile(file, new File(filePath));
            }catch (IOException e){
                e.printStackTrace();
            }
        }

*/





        //driver.quit();
    }
}