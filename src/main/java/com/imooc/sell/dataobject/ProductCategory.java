package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * 类目表product_category
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /*** 类目id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /*** 类目名称*/
    private String categoryName;
    /*** 类目编号*/
    private Integer categoryType;
    /*** 创建时间*/
    private Date createTime;
    /*** 修改时间*/
    private Date updateTime;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
    public ProductCategory() { }
}
