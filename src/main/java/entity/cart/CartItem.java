package entity.cart;

import entity.media.Media;
/**
 * Functional Cohesion: các chức năng liên quan tới CartItem
 */
public class CartItem {
    
    private Media media;
    private int quantity;
    private int price;

    public CartItem(){

    }

    public CartItem(Media media, Cart cart, int quantity, int price) {
        this.media = media;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Media getMedia() {
        return this.media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" 
            + " media='" + media + "'" 
            + ", quantity='" + quantity + "'" 
            + "}";
    }

}

    
