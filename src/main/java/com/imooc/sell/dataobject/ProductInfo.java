package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {
    /** 商品id*/
    @Id
    private String productId;

    /** 名称*/
    private String  productName;

    /** 单价*/
    private BigDecimal productPrice;

    /** 库存*/
    private Integer productStock;

    /** 小图*/
    private String productIcon;

    /** 描述*/
    private String productDescription;

    /** 商品状态0正常 1下架*/
    private Integer productStatus;

    /** 类目编号*/
    private Integer categoryType;

}
