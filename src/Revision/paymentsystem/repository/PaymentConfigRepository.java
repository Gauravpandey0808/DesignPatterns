package Revision.paymentsystem.repository;

import Revision.paymentsystem.entity.ProductConfig;

import java.util.List;
import java.util.Optional;

public interface PaymentConfigRepository {

    Optional<List<ProductConfig>> getAllProductConfig();

    Optional<ProductConfig> getProductConfigByName(String configName);
}
