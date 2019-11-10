package Pages;

import Base.Base;

import java.io.IOException;

public class CheckOutPage extends Base {
    public static void main(String[] args) throws IOException {
        HomePage homepage = new HomePage ();
        CartPage cartPage =new CartPage ();
        homepage.goToPage ();
        homepage.AddListInTheCart ();
        homepage.gotToCart ();
        cartPage.verifyList ();
    }
}
