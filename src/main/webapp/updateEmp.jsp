<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2023/2/4
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/updateEmp" method="get">
    <table>
        <tr hidden>
            <td hidden>编号</td>
            <td><input hidden name="empno" value="${emp.empno}"></td>
        </tr>
        <tr>
            <td>员工姓名</td>
            <td><input name="ename" value="${emp.ename}"></td>
        </tr>
        <tr>
            <td>职位</td>
            <td><input name="job" value="${emp.job}"></td>
        </tr>
        <tr>
            <td>工资</td>
            <td><input name="salary" value="${emp.salary}"></td>
        </tr>
        <tr>
            <td>奖金</td>
            <td><input name="bonus" value="${emp.bonus}"></td>
        </tr>
        <tr>
            <td>部门</td>
            <td>
                <select name="deptno">
                    <c:forEach items="${depts}" var="dept">
                        <c:if test="${emp.deptno==dept.deptno}">
                            <option selected value="${dept.deptno}">${dept.dname}</option>
                        </c:if>
                        <c:if test="${emp.deptno!=dept.deptno}">
                            <option value="${dept.deptno}">${dept.dname}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>
