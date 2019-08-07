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
<table>
		<tr>
			<td>
				植物名：
				${zhiwu.zname }
			</td>
		</tr>
		<tr>
			<td>
				描述：
				${zhiwu.zms }
			</td>
		</tr>
		<tr>
			<td>
				类别：
				${zhiwu.tname }
		</tr>

	</table>
</body>
</html>