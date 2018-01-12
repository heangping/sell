package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {
    @Autowired(required = false)
    private ProductInfoService productInfoService;

    @Test
    public void findOne() {
        ProductInfo productInfo= productInfoService.findOne("1000");
        Assert.assertEquals(1000,productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());

    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> pageList = productInfoService.findAll(pageRequest);
        System.out.println(pageList.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1001");
        productInfo.setProductName("皮皮吓");
        productInfo.setProductPrice(new BigDecimal(38));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("皮皮吓！贼好玩");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setCategoryType(5);
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        ProductInfo result= productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }
}