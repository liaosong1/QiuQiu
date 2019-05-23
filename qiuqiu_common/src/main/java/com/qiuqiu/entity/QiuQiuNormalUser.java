package com.qiuqiu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 普通用户类
 */
@Data
@Accessors(chain = true)
@TableName("qq_users")
public class QiuQiuNormalUser extends BasePojo{
    //用户id
    private int id;
    //用户名
    private String username;
    //用户昵称
    private String nickname;
    //密码
    private String password;
    //盐值
    private String salt;
    //封禁状态
    private int valid;
    //邮箱
    private String email;
    //个人简介
    private String instr;
    //性别
    private String sex;
    //头像
    private String icon;
}
