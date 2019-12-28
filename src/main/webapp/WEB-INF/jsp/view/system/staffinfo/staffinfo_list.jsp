<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- <%@ taglib uri="http://displaytag.sf.net" prefix="display" %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>首页</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../../../js/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../../../js/bootstrap.min.js"></script>


</head>

<body>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:0px; ">
        <li><a href="#">系统管理</a></li>
        <li>员工管理</li>
    </ul>
</div>
<div class="row alert alert-info" style="margin:0px; padding:3px;">
    <form class="form-horizontal">
        <div class="col-sm-1">条件:</div>
        <div class="col-sm-3">
            <select class="form-control  input-sm">
                <option>姓名</option>
                <option>性别</option>
            </select>
        </div>
        <div class="col-sm-3">
            <input type="text" class="form-control input-sm"/>
        </div>
        <input type="button" class="btn btn-danger" value="查询"/>
        <input type="button" class="btn btn-success" value="添加"
               onClick="javascript:window.location='${pageContext.request.contextPath}/view/view/system/staffinfo/staffinfo_add.jsp'"/>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
    <table class="table  table-condensed table-striped">
        <tr>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>员工性别</th>
            <th>员工年龄</th>
            <th>电话号码</th>
            <th>QQ</th>
            <th>入职时间</th>
            <th>操作</th>
        </tr>
        <c:forEach items="list" var="staff">
            <tr>
                <td><a href="staffinfo_show.html">1001</a></td>
                <td>${staff.staffName}</td>
                <td>${staff.staffSex}</td>
                <td>${staff.staffAge}</td>
                <td>${staff.staffMobilePhone}</td>
                <td>${staff.staffQQ}</td>
                <td>${staff.EntryTime}</td>
                <td>
                    <a href="staffinfo_update.html">修改</a>
                    <a href="修改">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
