package com.zhanglei.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhanglei.bean.ZhiWu;
import com.zhanglei.bean.Ztype;
/**
 * 业务层
 * @ClassName: ZhiService 
 * @Description: TODO
 * @author: may
 * @date: 2019年8月6日 上午10:12:08
 */
public interface ZhiService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO
	 * @param zhiwu
	 * @return列表
	 * @return: List<ZhiWu>
	 */
	PageInfo<ZhiWu> selects(ZhiWu zhiwu, Integer pageNum);
	/**
	 * 
	 * @Title: selectZtype 
	 * @Description: TODO
	 * @return 从表
	 * @return: List<Ztype>
	 */
	List<Ztype> selectZtype();
	/**
	 * 
	 * @Title: add 
	 * @Description: TODO
	 * @return 添加
	 * @return: List<Ztype>
	 */
	int add(ZhiWu zhiwu);
	/**
	 * 
	 * @Title: @Select 
	 * @Description: TODO
	 * @return 查看
	 * @return: List<Ztype>
	 */
	ZhiWu toupdateZhiWu(Integer zid);
	/**
	 * 
	 * @Title: update 
	 * @Description: TODO
	 * @param zhiwu
	 * @return修改
	 * @return: int
	 */
	int update(ZhiWu zhiwu);
	/**
	 * 
	 * @Title: selectById 
	 * @Description: TODO
	 * @param zid
	 * @return 查看功能
	 * @return: ZhiWu
	 */
	ZhiWu selectById(Integer zid);
	/**
	 * 
	 * @Title: deleteAll 
	 * @Description: TODO
	 * @param ids
	 * @return 批删功能
	 * @return: int
	 */
	int deleteAll(Integer[] ids);
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 删除功能
	 * @return: int
	 */
	int deleteById(Integer zid);

}
