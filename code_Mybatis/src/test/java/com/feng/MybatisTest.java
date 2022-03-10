package com.feng;

import com.feng.Mapper.StudentMapper;
import com.feng.Mapper.TeacherMapper;
import com.feng.pojo.Student;
import com.feng.pojo.Teacher1;
import com.feng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class MybatisTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent1();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher1> teacher = mapper.getTeacher();
        for (Teacher1 teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher1> teacher = mapper.getTeacher1();
        for (Teacher1 teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }
}
