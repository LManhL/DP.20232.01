package entity.payment;

/**
 * @author
 */

/**
 * Vi phạm DIP: Vì lớp CreditCard phụ thuộc vào lớp cụ thể là
 * CreditCard chứ không phải lớp trừu tượng nên dễ bị sửa đổi
 */

public class CreditCard {

    private String cardCode;
    private String owner;
    private String dateExpired;
    protected int cvvCode;

    public CreditCard(String cardCode, String owner, String dateExpired, int cvvCode) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
    }
}
