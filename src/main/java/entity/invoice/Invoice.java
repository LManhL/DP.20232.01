package entity.invoice;

import entity.order.Order;

/**
 * Mức cohesion: Communication cohesion
 * Do các phương thức trong class này dùng chung thuộc tính
 * @Nguyen Van Manh
 */

public class Invoice {

    private Order order;
    private int amount;
    
    public Invoice(){

    }

    public Invoice(Order order){
        this.order = order;
        this.amount = order.getTotal();
    }

    public Order getOrder() {
        return order;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void saveInvoice(){
        
    }
}
