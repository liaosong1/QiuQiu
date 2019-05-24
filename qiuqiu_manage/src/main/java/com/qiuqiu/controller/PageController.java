package com.qiuqiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {

    //跳转主页
    @RequestMapping("Index")
    public String doIndexUI(){
        return "firstPage";//templates/pages/firstPage.html
    }

    //跳转登陆页面
    @RequestMapping("Login")
    public String doLoginUI(){
        return "login";
    }


    //跳转视频审核通过页面
       @RequestMapping("sys/video/checked")
    public String checked(){
        return "sys/video/checked";
    }
    //跳转未审核视频页面
    @RequestMapping("sys/video/unCheck")
    public String unCheck(){
        return "sys/video/unCheck";
    }
    //跳转禁播视频页面
    @RequestMapping("sys/video/forbidden")
    public String forbidden(){
        return "sys/video/forbidden";
    }






    //跳转排行榜页面
    @RequestMapping("sys/rankingList/test")
    public String videoAndArticle(){
        return "sys/rankingList/test";
    }





    //跳转帖子审核通过页面
    @RequestMapping("sys/article/checked1")
    public String checked1(){
        return "sys/article/checked1";
    }
    //跳转未审核帖子页面
    @RequestMapping("sys/article/unCheck1")
    public String unCheck2(){
        return "sys/article/unCheck1";
    }
    //跳转禁播帖子页面
    @RequestMapping("sys/article/forbidden1")
    public String forbidden3(){
        return "sys/article/forbidden1";
    }





    //跳转上下页查询条页面
    @RequestMapping("common/doPageUI")
    public String doPageUI(){
        return "common/page";
    }


}
