package Revision.transactionhub.paymentgateway;

import Revision.transactionhub.adapter.PaymentAdapter;
import Revision.transactionhub.enums.LogType;
import Revision.transactionhub.log.*;

public class PayPalService implements PaymentGateway {
    AbstractLogger logger = new InfoLogger(new DebugLogger(new ErrorLogger(new NoneLogger(null))));
    public void initiatePayment(PaymentAdapter adapter) {
        logger.log("hello world", LogType.ERROR);
    }
}
