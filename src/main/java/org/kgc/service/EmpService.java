package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.EmpMapper;
import org.kgc.utils.DateUtil;
import org.kgc.utils.SqlSessionUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-14:20
 */
public class EmpService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    EmpMapper mapper = session.getMapper(EmpMapper.class);

    public List<HashMap> getEmps(String ename,Integer deptno,Integer salary) {

        return mapper.getEmps(ename,deptno,salary);

    }


    public int addEmp(HashMap map) {

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        map.put("hiredate",date);
        int i = mapper.addEmp(map);
        session.commit();
        return i;
    }

    public HashMap getEmpByEmpno(int empno) {
        return mapper.getEmpByEmpno(empno);
    }

    public int updateEmp(HashMap map) {
        int i = mapper.updateEmp(map);
        session.commit();
        return i;
    }

    public int fireEmp(int empno) {
        int i = mapper.fireEmp(empno);
        session.commit();
        return i;
    }
}
