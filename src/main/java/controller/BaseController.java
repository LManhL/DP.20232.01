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
Control Coupling 
Class này chứa các phương thức mà sử dụng trực tiếp đối tượng SessionInformation.cartInstance
 để thực hiện các tác vụ liên quan đến giỏ hàng (cart). Điều này tạo ra sự phụ thuộc giữa BaseController 
 và đối tượng SessionInformation.cartInstance, và BaseController đang điều khiển hoạt động của SessionInformation.cartInstance. 
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
