package subsystem.interbank;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
/*
	Lang Thành Long 20194098
	Common Coupling và Content Coupling khi thay đổi giá trị của 2 thuộc tính static là interbankPayloadConverter và interbankBoundary
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
