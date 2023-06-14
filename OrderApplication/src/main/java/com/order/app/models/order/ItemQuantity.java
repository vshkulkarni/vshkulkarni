package com.order.app.models.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ItemQuantity {
    private String name;
    private int price;
    private int quantity;
}
