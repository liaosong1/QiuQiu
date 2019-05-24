package com.qiuqiu.service;



import com.qiuqiu.exception.ServiceException;
import com.qiuqiu.mapper.QiuQiuVideoMapper;
import com.qiuqiu.vo.PageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.qiuqiu.entity.QiuQiuVideo;

import java.util.List;

@Service
public class QiuQiuVideoServiceImpl implements QiuQiuVideoService {
	@Autowired
	private QiuQiuVideoMapper qiuqiuVideoMapper;


	@Override
	public PageObject<QiuQiuVideo> findVideoByID(Integer id,Integer pageCurrent) {

		if (pageCurrent == null || pageCurrent < 1)
			throw new IllegalArgumentException("当前页码值不正确");

		int rowCount = qiuqiuVideoMapper.getRowCount(id);
		if (rowCount == 0)
			throw new ServiceException("没有找到对应记录");

		int pageSize = 5;
		int startIndex = (pageCurrent - 1) * pageSize;
		List<QiuQiuVideo> records = qiuqiuVideoMapper.findPageObjects(id, startIndex, pageSize);
		// 对查询结果进行封装并返回
		PageObject<QiuQiuVideo> po = new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		/*
		 * int pageCount=rowCount/pageSize; if(rowCount%pageSize!=0) { pageCount++; }
		 */
		int pageCount = (rowCount - 1) / pageSize + 1;
		po.setPageCount(pageCount);
		return po;
	}
}
