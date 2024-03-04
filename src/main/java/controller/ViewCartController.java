package controller;

import java.sql.SQLException;

import entity.cart.Cart;

/**
 * This class controls the flow of events when users view the Cart
 * 
 * @author nguyenlm
 */
public class ViewCartController extends BaseController {

    /**
     * This method checks the available products in Cart
     * 
     * @throws SQLException
     */
    // common coupling -> dùng trực tiếp các trường của class SessionInformation

    public void checkAvailabilityOfProduct() throws SQLException {
        SessionInformation.cartInstance.checkAvailabilityOfProduct();
    }

    /**
     * This method calculates the cart subtotal
     * 
     * @return subtotal
     */
    // common coupling -> dùng trực tiếp các trường của class SessionInformation
    public int getCartSubtotal() {
        int subtotal = SessionInformation.cartInstance.calSubtotal();
        return subtotal;
    }

}
