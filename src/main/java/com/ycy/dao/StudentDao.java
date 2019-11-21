package com.ycy.dao;

import com.ycy.po.Student;

import java.util.List;

/**
 * @author YuCy
 * @create 2019-11-21-11:00
 */
public interface StudentDao {
    /**
     * 查询全部
     * */
    List<Student>selectAll();
}
