package com.qiuqiu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 封禁原因信息表
 */
@Data
@Accessors(chain = true)
@TableName("qq_banarticle")
@NoArgsConstructor
public class QiuQiuBanReason extends BasePojo{
    private Integer articleId;
    private Integer adminId;
    private String content;
}
