package Pages;

import Base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CartPage extends Base {

    private By verify;
    private By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
    public By productName= By.cssSelector ("p.product-name");

    public void verify(String arg){
        verify = By.xpath("//p[contains(text(),'"+arg+"')]");
        seleniumUtil.waitForVisibility (verify);
        Assert.assertTrue (seleniumUtil.isDisplayed (verify));
    }
    public void takeScreenShot() throws IOException {
        seleniumUtil.waitForVisibility (placeOrder);
        seleniumUtil.screenShot ();

    }
    public void verifyList(){

        seleniumUtil.waitForVisibility (placeOrder);


        List items = Arrays.asList(HomePage.veggies);

        List<WebElement> products = seleniumUtil.findElements (productName);
        List<String> displayedProducts=new ArrayList<> ();

        int j = 0;

        for (WebElement product : products) {
            String[] name = product.getText ().split ("-");
            String formattedName = name[0].trim ();
            displayedProducts.add (formattedName);


        }
        Collections.sort (items);
        Collections.sort (displayedProducts);
        Assert.assertEquals (items, displayedProducts);


        }

    }


