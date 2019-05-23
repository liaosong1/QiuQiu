package com.qiuqiu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户帖子类
 */
@Data
@Accessors(chain = true)
@TableName("qq_article")
public class QiuQiuUserArticle extends BasePojo{
    @TableId(type= IdType.AUTO)
    private Integer id;
    //文章内容
    private String addres;
    //标题
    private String title;
    //点击量
    private Integer clickNum;
    //收藏量
    private Integer storeNum;
    //评论量
    private Integer commentNum;
    //作者id
    private Integer userId;
    private Integer banState;
}
