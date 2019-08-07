package com.zhanglei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhanglei.bean.ZhiWu;
import com.zhanglei.bean.Ztype;
import com.zhanglei.service.ZhiService;
/**
 * 控制层
 * @ClassName: ZhiController 
 * @Description: TODO
 * @author: may
 * @date: 2019年8月6日 上午10:15:01
 */
@Controller
public class ZhiController {

	@Autowired
	ZhiService sc;
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 列表
	 * @return: int
	 */
	@RequestMapping("list")
	public String selects(ZhiWu zhiwu,HttpServletRequest request,Integer pageNum) {
		
		PageInfo<ZhiWu> pg = sc.selects(zhiwu,pageNum);
		
		request.setAttribute("pg", pg);
		request.setAttribute("zhiwu", zhiwu);
		
		return "list";
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 去添加
	 * @return: int
	 */
	@RequestMapping("toAdd")
	public String toAdd(HttpServletRequest request) {
		
		List<Ztype> list = sc.selectZtype();
		
		request.setAttribute("list", list);
		return "add";
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 添加
	 * @return: int
	 */
	@ResponseBody
	@RequestMapping("add")
	public int add(ZhiWu zhiwu) {
		
		int i = sc.add(zhiwu);
		return i;
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 去修改
	 * @return: int
	 */
	@RequestMapping("toupdateZhiWu")
	public String toupdateZhiWu(HttpServletRequest request,Integer zid) {
		
		ZhiWu zhiwu = sc.toupdateZhiWu(zid);
		List<Ztype> list = sc.selectZtype();
		
		request.setAttribute("list", list);
		request.setAttribute("zhiwu", zhiwu);
		return "update";
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 修改
	 * @return: int
	 */
	@ResponseBody
	@RequestMapping("update")
	public int update(ZhiWu zhiwu) {
		
		int i = sc.update(zhiwu);
		return i;
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 查看
	 * @return: int
	 */
	@RequestMapping("selectById")
	public String selectById(HttpServletRequest request,Integer zid) {
		
		ZhiWu zhiwu = sc.selectById(zid);

		request.setAttribute("zhiwu", zhiwu);
		return "select";
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 批删
	 * @return: int
	 */
	@ResponseBody
	@RequestMapping("deleteAll")
	public int deleteAll(@RequestParam("ids[]")Integer[] ids) {
		
		int i = sc.deleteAll(ids);
		return i;
	}
	/**
	 * 
	 * @Title: deleteById 
	 * @Description: TODO
	 * @param zid
	 * @return 删除功能
	 * @return: int
	 */
	@ResponseBody
	@RequestMapping("deleteById")
	public int deleteById(Integer zid) {
		
		int i = sc.deleteById(zid);
		return i;
	}
}
