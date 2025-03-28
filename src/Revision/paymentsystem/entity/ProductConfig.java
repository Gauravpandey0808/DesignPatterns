package Revision.paymentsystem.entity;

import lombok.Data;
import java.util.List;

@Data
public class ProductConfig {

    private final Integer id;
    private final String description;
    private final String configName;
    private final List<String> values;
    private final boolean isActive;

    public ProductConfig(Integer id, String description, String configName, List<String> values, boolean isActive) {
        this.id = id;
        this.description = description;
        this.configName = configName;
        this.values = values;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getConfigName() {
        return configName;
    }

    public List<String> getValues() {
        return values;
    }

    public boolean isActive() {
        return isActive;
    }
}
