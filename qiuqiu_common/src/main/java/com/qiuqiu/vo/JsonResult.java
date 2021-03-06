package com.qiuqiu.vo;

import java.io.Serializable;
/**
 * Json结果包装类
 */
public class JsonResult implements Serializable{
    private static final long serialVersionUID = -4138033536625725437L;
    /**状态码*/
    private int state=1;//1 表示未审核()
    /**状态码对应的消息*/
    private String message="ok";
    /**页面上要具体呈现的数据*/
    private Object data;
    public int getState() {
        return state;
    }
    public JsonResult() {
    }


    public JsonResult(String message) {
        super();
        this.message = message;
    }


    public JsonResult(Object data) {
        super();
        this.data = data;
    }

    public JsonResult(Throwable e) {
        this.state=0;
        this.message=e.getMessage();
    }


    public void setState(int state) {
        this.state = state;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

}
