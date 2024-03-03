package controller;

import java.sql.SQLException;

/**
 * This class controls the flow of events when users view the Cart
 * @author nguyenlm
 */

/*
 * Common Coupling: do SessionInformation là class chứa các biến static và class ViewCartController
 * trực tiếp đọc và thay đổi cartInstance của nó.
*/
public class ViewCartController extends BaseController{
    
    /**
     * This method checks the available products in Cart
     * @throws SQLException
     */
    public void checkAvailabilityOfProduct() throws SQLException{
        SessionInformation.cartInstance.checkAvailabilityOfProduct();
    }

    /**
     * This method calculates the cart subtotal
     * @return subtotal
     */
    public int getCartSubtotal(){
        int subtotal = SessionInformation.cartInstance.calSubtotal();
        return subtotal;
    }

}
