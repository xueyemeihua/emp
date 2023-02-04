<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2023/2/4
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/addEmp" method="get">
        <table>
            <tr>
                <td>员工姓名</td>
                <td><input name="ename"></td>
            </tr>
            <tr>
                <td>职位</td>
                <td><input name="job"></td>
            </tr>
            <tr>
                <td>工资</td>
                <td><input name="salary"></td>
            </tr>
            <tr>
                <td>奖金</td>
                <td><input name="bonus"></td>
            </tr>
            <tr>
                <td>部门</td>
                <td>
                    <select name="deptno">
                        <c:forEach items="${depts}" var="dept">
                            <option value="${dept.deptno}">${dept.dname}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
