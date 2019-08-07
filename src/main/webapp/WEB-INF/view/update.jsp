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
<form action="">
<input type="hidden" value="${zhiwu.zid }" name="zid" />
	<table>
		<tr>
			<td>
				植物名：
				<input type="text" name="zname" value="${zhiwu.zname }" />
			</td>
		</tr>
		<tr>
			<td>
				描述：
				<input type="text" name="zms" value="${zhiwu.zms }" />
			</td>
		</tr>
		<tr>
			<td>
				类别：
				<select name="tid">
					 <option value="0">请选择</option>
					 <c:forEach items="${list }" var="t">
					 	<option value="${t.tid }"
					 		${t.tid==zhiwu.tid?"selected":"" }
					 	>${t.tname }</option>
					 </c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				<input type="button" value="修改" onclick="update()" />
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript">

	function update() {
		
		$.post("update", $("form").serialize(), function(amg) {
			if(amg>0){
				alert("修改成功！");
				location.href="list";
			}else{
				alert("修改失败！");
			}
		})
		
	}
</script>
</body>
</html>