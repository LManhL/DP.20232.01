package controller;

import java.util.List;

import entity.cart.Cart;
import entity.cart.CartItem;
import entity.media.Media;

/**
 * This class is the base controller for our AIMS project
 * @author nguyenlm
 */

/*
    Lang Thành Long 20194098
    Common Coupling và Content Coupling khi thay đổi giá trị static của SessionInformation.
    Ở phương thức checkMediaInCart có Stamp Coupling vì sử dụng toàn bộ entity Media làm tham số
 */
public class BaseController {
    
    /**
     * The method checks whether the Media in Cart, if it were in, we will return the CartMedia else return null
     * @param media
     * @return CartMedia or null
     */
    public CartItem checkMediaInCart(Media media){ // Stamp Coupling
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
