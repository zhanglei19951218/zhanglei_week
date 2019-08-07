<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index_work.css" type="text/css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/jquery.validate.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="list" method="post">
	
	查询内容：<input type="text" name="zname" value="${zhiwu.zname }">
	<input type="submit" value="查询" />

</form>
<table>
	<tr>
		<td>
			<input type="button" value="全选" onclick="qx()">
			<input type="button" value="全不选" onclick="qbx()">
		</td>
		<td>编号</td>
		<td>植物名称</td>
		<td>描述</td>
		<td>类别</td>
		<td>操作
			<input type="button" value="添加" onclick="toAdd()" />
		</td>
	</tr>
	<c:forEach items="${pg.list }" var="z" varStatus="i">
		<tr>
			<td>
				<input type="checkbox" value="${z.zid }" name="ck" />
			</td>
			<td>${i.index+1 }</td>
			<td>${z.zname }</td>
			<td>${z.zms }</td>
			<td>${z.tname }</td>
			<td>
				<input type="button" value="编辑" onclick="toupdateZhiWu(${z.zid})">
				<input type="button" value="查看" onclick="selectById(${z.zid})">
				<input type="button" value="删除" onclick="deleteById(${z.zid})">
			</td>
		</tr>
	
	</c:forEach>
	<tr>
		<td>
			<input type="button" value="批量删除" onclick="deleteAll()">
		</td>
		<td colspan="6">
			<input type="button" value="首页" onclick="fy(1)">
			<input type="button" value="上一页" onclick="fy(${pg.prePage==0?1:pg.prePage})">
			<input type="button" value="下一页" onclick="fy(${pg.nextPage==0?pg.pages:pg.nextPage})">
			<input type="button" value="尾页" onclick="fy(${pg.pages})">
		</td>
	</tr>
</table>

<script type="text/javascript">

	function fy(num) {
		location.href="list?pageNum="+num;
	}
	function qx() {
		$("[name='ck']").attr("checked",true);
	}
	function qbx() {
		$("[name='ck']").attr("checked",false);
	}
	function toAdd() {
		
		location.href="toAdd";
	}
	
	function toupdateZhiWu(zid) {
		location.href="toupdateZhiWu?zid="+zid;
	}
	
	function selectById(zid) {
		location.href="selectById?zid="+zid;
	}
	
	function deleteAll() {
		
		var ids = new Array();
		
		$("[name='ck']:checked").each(function(i) {
			ids[i] = $(this).val();
		})
		alert(ids);
		
		if(confirm("确认删除吗？")){
			
			$.post("deleteAll", {ids:ids}, function(amg) {
				if(amg>0){
					alert("删除成功！");
					location.href="list";
				}else{
					alert("删除失败！");
				}
			})
		}
	}
	
	function deleteById(zid) {
		
		if(confirm("确认删除吗？")){
			
			$.post("deleteById", {zid:zid}, function(amg) {
				if(amg>0){
					alert("删除成功！");
					location.href="list";
				}else{
					alert("删除失败！");
				}
			})
		}
	}
</script>
</body>
</html>