package com.qiuqiu.serviceimpl;

import com.qiuqiu.entity.QiuQiuBanReason;
import com.qiuqiu.entity.QiuQiuUserArticle;
import com.qiuqiu.mapper.QiuQiuUserArticleDao;
import com.qiuqiu.service.QiuQiuUserArticleService;
import com.qiuqiu.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QiuQiuUserArticleServiceImpl implements QiuQiuUserArticleService {
    @Autowired
    private QiuQiuUserArticleDao qiuQiuUserArticleDao;
    @Override
    public JsonResult findHasBanedArticle(Integer pageCurrent) {
        List<QiuQiuUserArticle> list=qiuQiuUserArticleDao.findQiuQiuUserArticleHasBaned(0,pageCurrent,5);
        return new JsonResult(list);
    }

    @Override
    public JsonResult findWiteExamineArticle(Integer pageCurrent) {
        List<QiuQiuUserArticle> list=qiuQiuUserArticleDao.findQiuQiuUserArticleHasBaned(1,pageCurrent,5);
        return new JsonResult(list);
    }

    @Override
    public JsonResult findAdoptExamineArticle(Integer pageCurrent) {
        List<QiuQiuUserArticle> list=qiuQiuUserArticleDao.findQiuQiuUserArticleHasBaned(2,pageCurrent,5);
        return new JsonResult(list);
    }

    @Override
    public JsonResult banArticleByIds(Integer[] ids) {
        qiuQiuUserArticleDao.buArticleByIds(ids,0);
        List<QiuQiuBanReason> qiuBanReason=new ArrayList<>();
        //由于还没写管理员登录这里管理员id暂时写死
        for (int i=0;i<ids.length;i++ ) {
            QiuQiuBanReason qiuQiuBanReason=new QiuQiuBanReason();
            qiuQiuBanReason.setAdminId(1);
            qiuQiuBanReason.setArticleId(ids[i]);
            qiuQiuBanReason.setContent("该文章违规");
            qiuBanReason.add(qiuQiuBanReason);
        }
        qiuQiuUserArticleDao.banArticleReason(qiuBanReason);
        return new JsonResult("封禁成功！");
    }

    @Override
    public JsonResult UnsealingArticleByIds(Integer[] ids) {
        qiuQiuUserArticleDao.buArticleByIds(ids,2);
        qiuQiuUserArticleDao.deleteBatchIds(Arrays.asList(ids));
        return new JsonResult("解封成功！");
    }
}
