package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-17:16
 */

import org.kgc.service.EmpService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;

public class ToUpdateEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据员工编号,查询员工信息
        int empno = Integer.parseInt(request.getParameter("empno"));
        EmpService empService = new EmpService();
        HashMap emp = empService.getEmpByEmpno(empno);

        request.setAttribute("emp",emp);

        request.getRequestDispatcher("/updateEmp.jsp").forward(request,response);
    }
}
