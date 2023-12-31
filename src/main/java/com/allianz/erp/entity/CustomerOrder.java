package com.allianz.erp.entity;

import com.allianz.erp.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table
@Entity
public class CustomerOrder extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "customerOrder")
    private List<OrderItem> orderItemList;

    @OneToOne(mappedBy = "customerOrder")
    private Bill bill;

}
