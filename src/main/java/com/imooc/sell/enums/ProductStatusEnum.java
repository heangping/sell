package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    UP("在架",0),
    DOWN("下架",1)
    ;

    private Integer code;
    private String message;
    ProductStatusEnum(String message,Integer code){
        this.message = message;
        this.code = code;
    }

}
