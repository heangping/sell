package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryOryRepositoryTest {
    @Autowired
    private ProductCategoryOryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(2);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("瑶灵灵3",3);
        ProductCategory productCategory1 = repository.save(productCategory);
        //System.out.println(productCategory1.toString());
        Assert.assertNotNull(productCategory1);
        //Assert.assertNotEquals(null,productCategory1);
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("哈哈哈");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> categoryList = Arrays.asList(1,2,3);
        List<ProductCategory> result= repository.findByCategoryTypeIn(categoryList);
        Assert.assertNotEquals(0,result.size());
    }



}