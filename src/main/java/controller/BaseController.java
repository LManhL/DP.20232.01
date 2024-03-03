package controller;

import java.util.List;

import entity.cart.Cart;
import entity.cart.CartItem;
import entity.media.Media;

/**
 * This class is the base controller for our AIMS project
 * @author nguyenlm
 */

/**
 * Common Coupling: do SessionInformation là class chứa các biến toàn cục và class BaseController
 * trực tiếp truy cập biến cartInstance của nó để xử lý logic về kiểm tra sản phẩm trong giỏ hàng và
 * lấy danh sách sản phẩm trong giỏ hàng
 */
public class BaseController {
    
    /**
     * The method checks whether the Media in Cart, if it were in, we will return the CartMedia else return null
     * @param media
     * @return CartMedia or null
     */
    public CartItem checkMediaInCart(Media media){
        return SessionInformation.cartInstance.checkMediaInCart(media);
    }

    /**
     * This method gets the list of items in cart
     * @return List[CartMedia]
     */
    public List getListCartMedia(){
        return SessionInformation.cartInstance.getListMedia();
    }
}
