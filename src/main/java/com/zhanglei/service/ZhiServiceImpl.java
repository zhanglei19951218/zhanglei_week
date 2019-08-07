package com.zhanglei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanglei.bean.ZhiWu;
import com.zhanglei.bean.Ztype;
import com.zhanglei.mapper.ZhiMapper;
/**
 * 业务层
 * @ClassName: ZhiService 
 * @Description: TODO
 * @author: may
 * @date: 2019年8月6日 上午10:12:08
 */
@Service
public class ZhiServiceImpl implements ZhiService {

	@Autowired
	ZhiMapper zhimapper;
	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO
	 * @param zhiwu
	 * @return列表
	 * @return: List<ZhiWu>
	 */
	@Override
	public PageInfo<ZhiWu> selects(ZhiWu zhiwu, Integer pageNum) {
		// TODO Auto-generated method stub
		
		pageNum=pageNum==null?1:pageNum;
		
		PageHelper.startPage(pageNum, 3);
		
		List<ZhiWu> list = zhimapper.selects(zhiwu);
		
		PageInfo<ZhiWu> pg = new PageInfo<>(list);
		
		return pg;
	}
	/**
	 * 
	 * @Title: selectZtype 
	 * @Description: TODO
	 * @return 从表
	 * @return: List<Ztype>
	 */
	@Override
	public List<Ztype> selectZtype() {
		// TODO Auto-generated method stub
		return zhimapper.selectZtype();
	}
	/**
	 * 
	 * @Title: add 
	 * @Description: TODO
	 * @return 添加
	 * @return: List<Ztype>
	 */
	@Override
	public int add(ZhiWu zhiwu) {
		// TODO Auto-generated method stub
		return zhimapper.add(zhiwu);
	}
	/**
	 * 
	 * @Title: @Select 
	 * @Description: TODO
	 * @return 查看
	 * @return: List<Ztype>
	 */
	@Override
	public ZhiWu toupdateZhiWu(Integer zid) {
		// TODO Auto-generated method stub
		return zhimapper.toupdateZhiWu(zid);
	}
	/**
	 * 
	 * @Title: update 
	 * @Description: TODO
	 * @param zhiwu
	 * @return修改
	 * @return: int
	 */
	@Override
	public int update(ZhiWu zhiwu) {
		// TODO Auto-generated method stub
		return zhimapper.update(zhiwu);
	}
	/**
	 * 
	 * @Title: selectById 
	 * @Description: TODO
	 * @param zid
	 * @return 查看功能
	 * @return: ZhiWu
	 */
	@Override
	public ZhiWu selectById(Integer zid) {
		// TODO Auto-generated method stub
		return zhimapper.selectById(zid);
	}

	@Override
	public int deleteAll(Integer[] ids) {
		// TODO Auto-generated method stub
		return zhimapper.deleteAll(ids);
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 删除功能
	 * @return: int
	 */
	@Override
	public int deleteById(Integer zid) {
		// TODO Auto-generated method stub
		return zhimapper.deleteById(zid);
	}
	
}
