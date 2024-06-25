package swag.lab.test.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PDPFun {

    public static String getNameOfProduct (WebDriver driver, WebDriverWait wait) {

        String nameOfProductOnPDPage = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).getText();
        System.out.println(nameOfProductOnPDPage);
        return nameOfProductOnPDPage;
    }

    public static void addProductToBag (WebDriver driver, WebDriverWait wait) throws InterruptedException {

        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(5000);
    }





}
