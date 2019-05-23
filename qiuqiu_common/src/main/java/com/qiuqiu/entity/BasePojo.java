package com.qiuqiu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

//定义父级pojo对象
@Data
@Accessors(chain=true)//chain 若为true，则setter方法返回当前对象
public class BasePojo implements Serializable {
    private Date createTime;
    private Date updateTime;
}