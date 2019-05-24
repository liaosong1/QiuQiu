package com.qiuqiu.mapper;


import com.qiuqiu.entity.QiuQiuVideo;

import java.util.List;

public interface QiuQiuVideoMapper  {

    Integer getRowCount(Integer id);

    List<QiuQiuVideo> findPageObjects(Integer id, int startIndex, int pageSize);
}
