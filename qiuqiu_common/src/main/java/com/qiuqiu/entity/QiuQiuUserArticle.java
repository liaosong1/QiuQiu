package com.qiuqiu.entity;

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
    //文章内容
    private String addres;
    //标题
    private String title;
    //点击量
    private int clickNum;
    //收藏量
    private int storeNum;
    //评论量
    private int commentNum;
    //作者id
    private int userId;
}
