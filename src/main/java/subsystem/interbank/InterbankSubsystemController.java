package subsystem.interbank;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * Mức cohesion: Functional cohesion
 * Do các phương thức trong class này hoạt động cùng một mục đích chức năng chính là
 * điều khiển việc tương tác với InterbankSubsystem
 * @Nguyen Van Manh
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
