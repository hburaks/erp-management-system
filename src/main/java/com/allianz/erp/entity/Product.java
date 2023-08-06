package com.allianz.erp.entity;

import com.allianz.erp.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


import java.math.BigDecimal;
import java.util.List;

@Data
@Table
@Entity
public class Product extends BaseEntity {

    @Column
    private String name;

    @Column
    private String info;

    @Column
    private int stock;

    @Column
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItemList;

    @Column
    private boolean isProductAvailable;

    @Column
    private BigDecimal taxAppliedPrice;

}
