package Pages;

import Base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;


public class HomePage extends Base {
    public By searchBox = By.cssSelector ("input[type='search']");
    public By searchButton = By.cssSelector ("button[type='submit']");

    public By productName= By.cssSelector ("h4.product-name");
    public By addToCard= By.xpath("//div[@class='product-action']//button");
    public By cart= By.xpath ("//*[@id='root']/div/header/div/div[3]/a[3]/img");
    public By proceedToCheckout= By.xpath ("//*[@id='root']/div/header/div/div[3]/div[2]/div[2]/button");
    public  static String[] veggies = {"Cucumber", "Brocolli","Beetroot","Walnuts"};



    public void goToPage() {
        seleniumUtil.navigate (url);
    }
    public  void clickSearchBox() {
        seleniumUtil.click (searchBox);
    }
    public void enterWord(String str) {
        seleniumUtil.sendKeys (searchBox,str);
    }
    public void ClickSearchButton() {
        seleniumUtil.click (searchButton);
    }

    public void isDisplayed(String arg) {
           seleniumUtil.waitForVisibility (productName);
            Assert.assertTrue (seleniumUtil.getText (productName).contains (arg));
        }



        public void addToCard(){

            seleniumUtil.waitForVisibility (addToCard);
        seleniumUtil.click (addToCard);
        }
    public void gotToCart(){


        seleniumUtil.click (cart);
        seleniumUtil.waitForVisibility (proceedToCheckout);
        seleniumUtil.click (proceedToCheckout);
    }
    public void AddListInTheCart(){




        List items = Arrays.asList(veggies);

        List<WebElement> products = seleniumUtil.findElements (productName);

        int j = 0;

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();


            if (items.contains(formattedName)) {

                //click add to card


                seleniumUtil.findElements(addToCard).get(i).click();
                j++;

            }
            if (j == items.size()) {
                break;
            }
        }

    }


    }


