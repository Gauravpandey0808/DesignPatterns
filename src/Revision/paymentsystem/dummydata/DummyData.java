package Revision.paymentsystem.dummydata;

import Revision.paymentsystem.entity.PSPProvider;
import Revision.paymentsystem.entity.PaymentMethods;
import Revision.paymentsystem.repository.PaymentConfigRepository;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public List<PSPProvider> createPSPDummyData() {
        List<PSPProvider> pspProvidersList = new ArrayList<>();
        PSPProvider pspProvider1 = new PSPProvider(1,
                "PayPal",
                true, List.of(
                new PaymentMethods(1, "Credit Card", true),
                new PaymentMethods(2, "Debit Card", true),
                new PaymentMethods(3, "PayPal Wallet", true)));

        PSPProvider pspProvider2 = new PSPProvider(1,
                "Stripe",
                true, List.of(
                new PaymentMethods(1, "Credit Card", true),
                new PaymentMethods(2, "UPI", true),
                new PaymentMethods(3, "Net Banking", true)));

        PSPProvider pspProvider3 = new PSPProvider(1,
                "Razorpay",
                true, List.of(
                new PaymentMethods(1, "UPI", true),
                new PaymentMethods(2, "Net Banking", true),
                new PaymentMethods(3, "Debit Card", true)));

        pspProvidersList.add(pspProvider1);
        pspProvidersList.add(pspProvider2);
        pspProvidersList.add(pspProvider3);

        return pspProvidersList;
    }

    public List<PaymentConfigRepository> createPaymentConfigDummyData() {
        return null;
    }



}
