package swag.lab.test.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.page_object.CheckoutYourInformation;

public class CheckOutFun {

    public static void  checkOutFun(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("checkout")).click();

    }

    public static void submitFormFun(WebDriver driver, WebDriverWait wait) {

        driver.findElement(CheckoutYourInformation.firstName).click();
        driver.findElement(CheckoutYourInformation.firstName).sendKeys("Tatjana");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Nikolov");
        driver.findElement(By.id("postal-code")).click();
        driver.findElement(By.id("postal-code")).sendKeys("Beograd 11041");
        driver.findElement(By.id("continue")).click();

    }

    public static void  finishCheckoutFun(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("finish")).click();

    }

    public static void  messageAfterPurchaseFun(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")).isDisplayed();

    }

    public static void  backHomeButtonFun(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("back-to-products")).click();

    }




}
