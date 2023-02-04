package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-14:20
 */
public interface EmpMapper {

    List<HashMap> getEmps(@Param("ename") String ename, @Param("deptno") Integer deptno, @Param("salary") Integer salary);

    int addEmp(HashMap map);

    HashMap getEmpByEmpno(@Param("empno") int empno);

    int updateEmp(HashMap map);

    int fireEmp(@Param("empno") int empno);
}
