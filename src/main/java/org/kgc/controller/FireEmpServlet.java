package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-18:49
 */

import org.kgc.service.EmpService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FireEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empno = Integer.parseInt(request.getParameter("empno"));
        EmpService service = new EmpService();
        int i = service.fireEmp(empno);
        response.sendRedirect("getEmps?ename=&_deptno=0&salary=0");
    }
}
