package com.qiuqiu.service;





import com.qiuqiu.entity.QiuQiuVideo;
import com.qiuqiu.vo.PageObject;

public interface QiuQiuVideoService {
    //根据视频id查询info
    PageObject<QiuQiuVideo> findVideoByID(Integer id, Integer pageCurrent);


}
