package com.order.app.models.order;




import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Entity
public class Order {
    @Id
    String id;

    private String restaurantId;
    private List<ItemQuantity> items;
    private int totalPrice;
    private long orderTime;
    private String specialNote;
    private long deliveryTime;
    private String paymentId;
    private String note;


}
