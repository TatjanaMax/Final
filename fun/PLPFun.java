package swag.lab.test.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.test.page_object.ProductListingPagePageObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.List;
import java.util.stream.Collectors;

public class PLPFun {
    public static void clickOnFirstPLP (WebDriver driver, WebDriverWait wait) {

        //Click on First PLP Product
        driver.findElement(ProductListingPagePageObject.firstProductFromList).isDisplayed();
        driver.findElement(ProductListingPagePageObject.firstProductFromList).click();
    }

    public static void homePageFun (WebDriver driver, WebDriverWait wait) {

        //Verify Home Page
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).isDisplayed();

    }



        public static void sortAscedingOrder(WebDriver driver,WebDriverWait wait) throws InterruptedException {



            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).click();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();


            //1.before filter capture the prices

            List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));

            //1.1 remove the $ symbol from the price and convert the string into double

            List<Double> beforeFilterPriceList = new ArrayList<>();

            for (WebElement p : beforeFilterPrice) {
                beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
            }


            //2.filter the prices from dropdown
            Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
            dropdown.selectByVisibleText("Price (low to high)");


            //3.after filter capture the prices

            List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));
            //3.1 remove $ symbol from the prices and convert the string into double
            List<Double> afterFilterPriceList = new ArrayList<>();

            for (WebElement p : afterFilterPrice) {
                afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));

            }
            //4. compare the values/Assert the values (first we need to sort the values of beforeFilterPrice)
            Collections.sort(beforeFilterPriceList);//it will sort the values in the list
            Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
            Thread.sleep(5000);
            driver.quit();


        }


}












