package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-16:21
 */

import org.kgc.service.EmpService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;

public class AddEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        String _salary = request.getParameter("salary");
        int salary = Integer.parseInt(_salary);
        String _bonus = request.getParameter("bonus");
        int bonus = Integer.parseInt(_bonus);
        String _deptno = request.getParameter("deptno");
        int deptno = Integer.parseInt(_deptno);


        HashMap map = new HashMap();
        map.put("ename",ename);
        map.put("job",job);
        map.put("salary",salary);
        map.put("bonus",bonus);
        map.put("deptno",deptno);

        System.out.println(map);
        EmpService service = new EmpService();

        int i = service.addEmp(map);

        response.sendRedirect("getEmps?ename=&_deptno=0&salary=0");

    }
}
