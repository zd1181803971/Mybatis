import com.dzu.mapper.TeacherMapper;
import com.dzu.pojo.Teacher;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {

    @org.junit.Test
    public void test() throws IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(2);

            System.out.println(teacher);

        sqlSession.close();
    }

    @org.junit.Test
    public void test2() throws IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(2);

        System.out.println(teacher);

        sqlSession.close();
    }
}
