package controller;

import java.sql.SQLException;

import entity.cart.Cart;

/**
 * This class controls the flow of events when users view the Cart
 * @author nguyenlm
 */

/**
 * Common Coupling: do SessionInformation là class chứa các biến toàn cục và class ViewCartController
 * trực tiếp truy cập sử dụng biến cartInstance của nó để xử lý logic kiểm tra khả dụng sản phẩm và
 * tính tổng tiền trong giỏ hàng
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
