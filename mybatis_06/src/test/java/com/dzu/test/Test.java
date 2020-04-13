package com.dzu.test;


import com.dzu.mapper.StudentMapper;
import com.dzu.mapper.TeacherMapper;
import com.dzu.pojo.Student;
import com.dzu.pojo.Teacher;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        session.close();
    }
    @org.junit.Test
    public void studentTest() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);

        }
    }
    @org.junit.Test
    public void studentTest2() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);

        }
    }


}
