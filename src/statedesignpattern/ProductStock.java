package statedesignpattern;

import statedesignpattern.dto.ProductDto;
import statedesignpattern.enums.ProductEnum;


import java.util.ArrayList;
import java.util.List;

public class ProductStock {
    private final List<ProductDto> currentStock = new ArrayList<>();

    public List<ProductDto> getCurrentStock() {
        currentStock.add(new ProductDto(ProductEnum.PEPSI, 30, 20));
        currentStock.add(new ProductDto(ProductEnum.COCACOLA, 20, 20));
        currentStock.add(new ProductDto(ProductEnum.SODA, 30, 30));
        currentStock.add(new ProductDto(ProductEnum.WATER, 20, 20));
        currentStock.add(new ProductDto(ProductEnum.CHIPS, 30, 40));
        currentStock.add(new ProductDto(ProductEnum.SNEAKERS, 20, 50));
        return currentStock;
    }


}
