package entity.payment;

/**
 * @author
 */

/**
 * Mức cohesion: Communication cohesion
 * Do các phương thức trong class này dùng chung thuộc tính
 * @Nguyen Van Manh
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
