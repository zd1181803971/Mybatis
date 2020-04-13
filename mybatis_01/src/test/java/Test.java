import com.dzu.mapper.CustomerMapper;
import com.dzu.pojo.Customer;
import com.dzu.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
         SqlSession session = MybatisUtils.getSqlSession();
        //4.使用SqlSession创建Dao接口的代理对象
        CustomerMapper csm = session.getMapper(CustomerMapper.class);
        //5，使用代理对象执行方法
        Customer cs =  csm.selectById(1);
        System.out.println(cs);
        session.commit();
        session.close();
    }
    @org.junit.Test
    public void insertTest() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        int i = mapper.insertUser(new Customer(4, "zd", "dawd", 123456));
        if(i>0){
            System.out.println("yes");
        }
        session.commit();
        session.close();
    }
}
