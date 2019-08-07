package com.zhanglei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zhanglei.bean.ZhiWu;
import com.zhanglei.bean.Ztype;
/**
 * 
 * @ClassName: ZhiMapper 
 * @Description: mapper接口
 * @author: may
 * @date: 2019年8月6日 上午10:07:26
 */
public interface ZhiMapper {
/**
 * 
 * @Title: selects 
 * @Description: TODO
 * @param zhiwu
 * @return列表
 * @return: List<ZhiWu>
 */
	List<ZhiWu> selects(ZhiWu zhiwu);
/**
 * 
 * @Title: selectZtype 
 * @Description: TODO
 * @return 从表
 * @return: List<Ztype>
 */
	@Select("select * from ztype")
	List<Ztype> selectZtype();
	/**
	 * 
	 * @Title: add 
	 * @Description: TODO
	 * @return 添加
	 * @return: List<Ztype>
	 */
	@Insert("insert into zhiwu set zname=#{zname},zms=#{zms},tid=#{tid}")
	int add(ZhiWu zhiwu);
	/**
	 * 
	 * @Title: @Select 
	 * @Description: TODO
	 * @return 查看
	 * @return: List<Ztype>
	 */
	@Select("select * from zhiwu where zid=#{zid}")
	ZhiWu toupdateZhiWu(Integer zid);
/**
 * 
 * @Title: update 
 * @Description: TODO
 * @param zhiwu
 * @return修改
 * @return: int
 */
	@Update("update zhiwu set zname=#{zname},zms=#{zms},tid=#{tid} where zid=#{zid}")
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
	int deleteAll(@Param("ids")Integer[] ids);
/**
 * 
 * @Title: deleteById 
 * @Description: TODO
 * @param zid
 * @return 删除功能
 * @return: int
 */
	@Delete("delete from zhiwu where zid=#{zid}")
	int deleteById(Integer zid);



}
