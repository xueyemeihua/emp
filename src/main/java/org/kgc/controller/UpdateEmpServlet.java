package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-17:45
 */

import org.kgc.service.EmpService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;

public class UpdateEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Integer empno = Integer.parseInt(request.getParameter("empno"));
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int bonus = Integer.parseInt(request.getParameter("bonus"));
        int deptno = Integer.parseInt(request.getParameter("deptno"));
        HashMap map = new HashMap();
        map.put("empno",empno);
        map.put("ename",ename);
        map.put("job",job);
        map.put("salary",salary);
        map.put("bonus",bonus);
        map.put("deptno",deptno);
        EmpService service = new EmpService();
        int i = service.updateEmp(map);

        response.sendRedirect("getEmps?ename=&_deptno=0&salary=0");

    }
}
