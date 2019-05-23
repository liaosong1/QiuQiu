package com.qiuqiu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 管理员用户类
 */
@Data
@Accessors(chain = true)
@TableName("qq_admin")//对应数据库中的 qq_admin表
public class QiuQiuAdminUser extends BasePojo{
    private int id;
    private String adminName;
    private String password;
    private String salt;
    private Integer rolesId;
    private int valid;
}
