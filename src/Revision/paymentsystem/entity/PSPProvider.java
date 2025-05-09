package Revision.paymentsystem.entity;

import lombok.Data;
import java.util.List;

@Data
public class PSPProvider {

    private final Integer id;

    private final String PSPName;

    private final boolean isActive;

    private final List<PaymentMethods> paymentMethodsList;

    public PSPProvider(Integer id, String PSPName, boolean isActive, List<PaymentMethods> paymentMethodsList) {
        this.id = id;
        this.PSPName = PSPName;
        this.isActive = isActive;
        this.paymentMethodsList = paymentMethodsList;
    }
}
