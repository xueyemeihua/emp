package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.DeptMapper;
import org.kgc.mapper.EmpMapper;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-15:24
 */
public class DeptService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    DeptMapper mapper = session.getMapper(DeptMapper.class);

    public List<HashMap> getDepts() {
        return mapper.getDepts();
    }

}
