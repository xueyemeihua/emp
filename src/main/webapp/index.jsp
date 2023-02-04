<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2023/2/4
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/getEmps?ename=&_deptno=0&salary=0" methods="get">员工管理</a>

<div align="center">
    <form action="/getEmps" method="get">
        姓名:<input name="ename">&nbsp;
        部门:<select name="_deptno">
        <option value="0">请选择</option>
        <c:forEach var="dept" items="${depts}">
            <option value="${dept.deptno}">${dept.dname}</option>
        </c:forEach>
    </select>&nbsp;
        工资:<input name="salary">&nbsp;
        <input type="submit" value="查询">
    </form>&nbsp;
    <a href="/add.jsp">增加</a>

    <table cellspacing="0px" cellpadding="0px" border="1px" align="center">
        <tr align="center" bgcolor="aqua">
            <th>员工编号</th>
            <th>名字</th>
            <th>职位</th>
            <th>工资</th>
            <th>奖金</th>
            <th>入职日期</th>
            <th>部门</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${emps}" var="emp">
            <tr align="center">
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.salary}</td>
                <td>${emp.bonus}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.dname}</td>
                <td>
                    <a href="javascript:void(0)" onclick="fireEmp(${emp.empno})">开除</a>&nbsp;


<%--1.先查询,实现数据回显
    2.实现修改功能
    3.回到首页,最近数据的展示
--%>
                    <a href="/toUpdateEmp?empno=${emp.empno}">修改</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</div>
<script>
    function fireEmp(empno){
        var b = confirm("你真的要开除他吗?")
        if (b) {
            window.location="/fireEmp?empno="+empno
        }
    }
</script>

</body>
</html>
