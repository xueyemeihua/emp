package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-14:29
 */

import org.kgc.service.DeptService;
import org.kgc.service.EmpService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetEmpsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //获取客户端传递的数据
        String ename = request.getParameter("ename");
        String _deptno = request.getParameter("_deptno");
        int deptno = Integer.parseInt(_deptno);
        int salary = 0;
        String _salary = request.getParameter("salary");
        if(_salary != "") {
            salary = Integer.parseInt(_salary);
        }
        EmpService service = new EmpService();
        List<HashMap> emps = service.getEmps(ename,deptno,salary);

        DeptService deptService = new DeptService();
        List<HashMap> depts = deptService.getDepts();

        request.setAttribute("emps",emps);
        request.getSession().setAttribute("depts",depts);

        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
