package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatusBy() {
        List<ProductInfo> productInfos = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1000");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(5.8));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("香喷喷的皮蛋廋肉粥！贼好喝");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setCategoryType(5);
        productInfo.setProductStatus(0);
        ProductInfo result= repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
        ProductInfo productInfo = repository.findOne("1000");
        Assert.assertNotNull(null,productInfo);
    }

    @Test
    public void findAll() {
    }
}