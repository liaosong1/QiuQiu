package com.qiuqiu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiuqiu.entity.QiuQiuBanReason;
import com.qiuqiu.entity.QiuQiuUserArticle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QiuQiuUserArticleDao extends BaseMapper<QiuQiuUserArticle> {
    List<QiuQiuUserArticle> findQiuQiuUserArticleHasBaned(Integer type,Integer pageCurrent,Integer pageSize);

    void buArticleByIds(@Param("ids")Integer[] ids,@Param("valid")Integer valid);

    void banArticleReason(@Param("qiuBanReason") List<QiuQiuBanReason> qiuBanReason);
}
