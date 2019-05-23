package com.qiuqiu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 视频信息表
 */
import java.util.Date;
@Data
@Accessors(chain = true)
@TableName("qq_videos")
public class QiuQiuVideo {
    private int id;
    private String title;
    private Date createTime;
    private int type;
    private String photoSrc;
    private String videoSrc;
    private int clickNum;
    private int storeNum;
    private int time;
    private int commentNum;
    private int valid;
    private int userId;
}
