package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/text-box");


        WebElement username=driver.findElement(By.cssSelector("#userName-wrapper >:nth-child(2)>input"));
        username.sendKeys("Automation");

        WebElement email=driver.findElement(By.cssSelector("#userEmail-wrapper> :nth-child(2)>input"));
        email.sendKeys("Testing");

        WebElement currentAddress=driver.findElement(By.cssSelector("#currentAddress-wrapper>:nth-child(2)>textarea"));
        currentAddress.sendKeys("Testing Current Address");
        //bekle(5);

        WebElement permanentAddress=driver.findElement(By.cssSelector("#permanentAddress-wrapper>:nth-child(2)>textarea"));
        permanentAddress.sendKeys("Permanent Automation");
         //bekle(5);

         WebElement submitButton=driver.findElement(By.id("#submit)"));
        submitButton.click();
        //bekle(5);

         if(username.getText().contains("Automation") && email.getText().contains("Testing"))
             System.out.println("Test passed");
         else
             System.out.println("Test failed" +
                     "" );




        BekleKapat();
    }
}
