package com.qiuqiu.controller;

import com.qiuqiu.entity.QiuQiuVideo;
import com.qiuqiu.service.QiuQiuVideoService;
import com.qiuqiu.vo.JsonResult;
import com.qiuqiu.vo.PageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/index/")
@Controller
public class QiuQiuVideoController {
    @Autowired
    private QiuQiuVideoService qiuqiuVideoService;

    /*根据视频id查询info*/
    @RequestMapping("findVideoByID")
    @ResponseBody
    public JsonResult findVideoByID(Integer id, Integer pageCurrent) {
        PageObject<QiuQiuVideo> pageObject = qiuqiuVideoService.findVideoByID(id, pageCurrent);
        return new JsonResult(pageObject);
    }


}