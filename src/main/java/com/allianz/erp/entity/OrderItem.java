package com.allianz.erp.entity;

import com.allianz.erp.model.OrderItemStatusTypeEnum;
import com.allianz.erp.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table
@Entity
@Data
public class OrderItem extends BaseEntity {
    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @Column
    private OrderItemStatusTypeEnum orderItemStatusTypeEnum;

    @Column
    private int quantity;

    @Column
    private BigDecimal price;

    @Column
    BigDecimal taxAmount;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

}



