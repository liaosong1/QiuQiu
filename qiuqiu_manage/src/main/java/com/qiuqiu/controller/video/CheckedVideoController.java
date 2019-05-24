package com.qiuqiu.controller.video;

import com.qiuqiu.entity.QiuQiuVideo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/video/")
@Controller
public class CheckedVideoController {

    //显示信息
    @RequestMapping("doFindPageObjects")
    @ResponseBody
    public JsonResult doFindPageObjects(String username, Integer pageCurrent) {
        PageObject<QiuQiuVideo> pageObject = QiuQiuVideoService.findPageObjects(username, pageCurrent);
        return new JsonResult(pageObject);
    }
}
