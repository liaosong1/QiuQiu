package com.qiuqiu.serviceimpl;

import com.qiuqiu.entity.QiuQiuBanReason;
import com.qiuqiu.entity.QiuQiuUserArticle;
import com.qiuqiu.mapper.QiuQiuUserArticleDao;
import com.qiuqiu.service.QiuQiuUserArticleService;
import com.qiuqiu.vo.JsonResult;
import com.qiuqiu.vo.PageObject;
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
        return data(pageCurrent,0,null);
    }

    @Override
    public JsonResult findWiteExamineArticle(Integer pageCurrent) {
        return data(pageCurrent,2,null);
    }
    public JsonResult data(Integer pageCurrent,int type,String condition){
        PageObject<QiuQiuUserArticle> po=new PageObject();
        po.setPageCurrent(pageCurrent);
        po.setPageSize(5);
        List<QiuQiuUserArticle> list=qiuQiuUserArticleDao.findQiuQiuUserArticleHasBaned(type,pageCurrent-1,po.getPageSize(),condition);
        po.setRecords(list);
        po.setRowCount(list.size());
        int pageCount=(list.size()-1)/5+1;
        po.setPageCount(pageCount);
        return new JsonResult(po);
    }
    @Override
    public JsonResult findAdoptExamineArticle(Integer pageCurrent) {
        return data(pageCurrent,1,null);
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
        return new JsonResult("操作成功！");
    }

    @Override
    public JsonResult UnsealingArticleByIds(Integer[] ids) {
        qiuQiuUserArticleDao.buArticleByIds(ids,1);
        List<Integer> qiuBanReason= new ArrayList(Arrays.asList(ids));
        qiuQiuUserArticleDao.deleteReason(qiuBanReason);
        return new JsonResult("操作成功！");
    }

    @Override
    public JsonResult findAdoptExamine(Integer pageCurrent, String condition) {
        return data(pageCurrent,1,condition);
    }

    @Override
    public JsonResult findBanedExamine(Integer pageCurrent, String condition) {
        return data(pageCurrent,0,condition);
    }

    @Override
    public JsonResult findwaitExamine(Integer pageCurrent, String condition) {
        return data(pageCurrent,2,condition);
    }
}
