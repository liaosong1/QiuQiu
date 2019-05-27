package com.qiuqiu.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 页面表格表示类
 */
@Data

@Accessors(chain = true)
public class PageObject<T> implements Serializable {//类泛型
    private static final long serialVersionUID = 9006975610628757844L;
    /**
     * 当前页要呈现的记录
     */
    private List<T> records;
    /**
     * 总记录数
     */
    private Integer rowCount = 0;
    /**
     * 总页数
     */
    private Integer pageCount = 0;
    /**
     * 当前页码
     */
    private Integer pageCurrent = 1;
    /**
     * 页面大小(每页最多显示多少条记录)
     */
    private Integer pageSize = 5;


}
