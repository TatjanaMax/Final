package swag.lab.test.shoping_bag;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import swag.lab.test.fun.*;
import utility.BeforeAll;


public class ShoppingBagTest extends BeforeAll {

    @Test

    public void shoppingBagTest() throws InterruptedException {

        //Log in
        LogInPageFun.logInValidAccount(driver, wait);


        //Click on First Product from PLP
        PLPFun.clickOnFirstPLP(driver, wait);

        //Get Name of Product in PDP
        String nameInProductPage = PDPFun.getNameOfProduct(driver, wait);

        //Add to Cart
        PDPFun.addProductToBag(driver, wait);

        //Go to Cart
        CardFun.goToCart(driver, wait);

        //Check name of product in cart
        String nameInCartPage = CardFun.getProductNameInCart(driver, wait);

        //Check Names
        Assert.assertEquals(nameInProductPage, nameInCartPage);

        //Click on Checkout Button
        CheckOutFun.checkOutFun(driver, wait);

        //Submit Checkout form
        CheckOutFun.submitFormFun(driver, wait);

        //Finish
        CheckOutFun.finishCheckoutFun(driver, wait);

        //Verify meesage after purchese
        CheckOutFun.messageAfterPurchaseFun(driver, wait);

        //Back to PLPage
        CheckOutFun.backHomeButtonFun(driver, wait);

        //Verify PLP Page
        PLPFun.homePageFun(driver, wait);


        //Sorting
        PLPFun.sortAscedingOrder(driver, wait);
        //PLPFun.filterMenuFun(driver, wait);


    }


}


