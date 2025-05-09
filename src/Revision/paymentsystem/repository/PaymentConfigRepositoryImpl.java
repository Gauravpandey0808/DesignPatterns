package Revision.paymentsystem.repository;

import Revision.paymentsystem.entity.ProductConfig;

import java.util.List;
import java.util.Optional;


public class PaymentConfigRepositoryImpl implements PaymentConfigRepository {

    private final List<ProductConfig> productConfigList;

    public PaymentConfigRepositoryImpl(List<ProductConfig> productConfigList) {
        this.productConfigList = productConfigList;
    }

    @Override
    public Optional<List<ProductConfig>> getAllProductConfig() {
        return Optional.ofNullable(productConfigList);
    }

    @Override
    public Optional<ProductConfig> getProductConfigByName(String configName) {
        return productConfigList
                .stream()
                .filter(config -> configName.equals(config.getConfigName()))
                .findFirst();
    }
}
