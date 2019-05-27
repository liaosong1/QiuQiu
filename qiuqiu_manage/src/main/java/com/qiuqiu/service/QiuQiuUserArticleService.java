package com.qiuqiu.service;

import com.qiuqiu.vo.JsonResult;

public interface QiuQiuUserArticleService {

   JsonResult findHasBanedArticle(Integer pageCurrent);

   JsonResult findWiteExamineArticle(Integer pageCurrent);

   JsonResult findAdoptExamineArticle(Integer pageCurrent);

   JsonResult banArticleByIds(Integer[] ids);

   JsonResult UnsealingArticleByIds(Integer[] ids);

   JsonResult findAdoptExamine(Integer pageCurrent,String condition);

   JsonResult findBanedExamine(Integer pageCurrent, String condition);

   JsonResult findwaitExamine(Integer pageCurrent, String condition);
}
