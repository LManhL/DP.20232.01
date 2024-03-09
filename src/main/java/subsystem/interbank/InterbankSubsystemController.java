package subsystem.interbank;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * Functional Cohesion: các chức năng liên quan tới giao dịch liên ngân hàng về đơn hàng, gồm thanh toán
 * đơn hàng và hoàn tiền
 */
public class InterbankSubsystemController {

	private static InterbankPayloadConverter interbankPayloadConverter = new InterbankPayloadConverter();
	private static InterbankBoundary interbankBoundary = new InterbankBoundary();

	public PaymentTransaction refund(CreditCard card, int amount, String contents) {
		return null;
	}

	public PaymentTransaction payOrder(CreditCard card, int amount, String contents) {
		String requestPayload = interbankPayloadConverter.convertToRequestPayload(card, amount, contents);
		String responseText = interbankBoundary.query(InterbankConfigs.PROCESS_TRANSACTION_URL, requestPayload);
		return interbankPayloadConverter.extractPaymentTransaction(responseText);
	}

}
