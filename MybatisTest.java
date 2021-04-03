
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.UserMapper;
import com.my.util.MyBatisUtil;
import com.my.vo.User;

public class MybatisTest {

	public static void main(String[] args) throws Exception {
		SqlSession session=MyBatisUtil.getSession();
		
/*		//读取mybatis-config.xml文件
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		
		//初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		
		//创建session实例
		SqlSession session=sqlSessionFactory.openSession();
		
	    //创建User对象
		User user=new User("admin","男",26);
		
		//插入数据
		session.insert("com.my.mapper.UserMapper.save",user);
		
		//提交事务
		session.commit();
		
		//关闭session
		session.close();

        //选择一条数据
		User user=session.selectOne("com.my.mapper.UserMapper.findUserById", new Integer(1));
		System.out.println(user.getName());
		session.close();

  
		//删除数据
		session.delete("com.my.mapper.UserMapper.deleteUserById",new Integer(2));
		session.commit();
		System.out.println("删除第二条数据");
		session.close();
		
		//修改数据
		String statement = "com.my.mapper.UserMapper.updateUserById";//映射sql的标识字符串
        User user = new User();
        user.setId(1);
        user.setName("world");
        user.setSex("男");
        user.setAge(25);
        
        //执行修改操作
        int retResult = session.update(statement,user);
      
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        session.close();
        System.out.println(retResult);
        
		User user=session.selectOne("com.my.mapper.UserMapper.findUser");
		System.out.println(user);
	
		 测试selectOne一个参数
		User user=session.selectOne("com.my.mapper.UserMapper.findUserById",new Integer(1));
		System.out.println(user);
	
		
		//<E> List<E> selectList(Sting statement)
		List <User> userList=session.selectList("com.my.mapper.UserMapper.findUsers");
		for(User user:userList) {
			System.out.println(user);
		}
		
		// <E> List<E> selectList(String statement,Object )
		List <User> userList1=session.selectList("com.my.mapper.UserMapper.findUsers1",new Integer(18));
		for(User user:userList1) {
			System.out.println(user);
		}
		
		//<E> List<E> selectList(String statement,Object parameter,RowBoundsrowBounds )
		RowBounds rowBounds=new RowBounds
		List <User> userList2=session.selectList("com.my.mapper.UserMapper.findUsers1",new Integer(18));
		for(User user:userList1) {
			System.out.println(user);
		}
		
		//测试getMapper方法
		//1 saveUser
		UserMapper userMapper=session.getMapper(UserMapper.class);
		User user=new User();
		user.setName("wangxiaoer");
		user.setAge(22);
		user.setSex("男");
		userMapper.saveUser(user);
		session.commit();

			
		//2 测试 findUserById
		UserMapper userMapper=session.getMapper(UserMapper.class);
		User user=userMapper.findUserById(9);
		System.out.println(user);

	
		//删除  deleteUserById
		UserMapper userMapper=session.getMapper(UserMapper.class);
		userMapper.deleteUserById(1);
		session.commit();
		
		//修改 updateUserById
		UserMapper userMapper=session.getMapper(UserMapper.class);
		User user=new User();
		user.setId(2);
		user.setName("王小二");
		user.setAge(22);
		user.setSex("男");
		userMapper.updateUserById(user);
		session.commit();
		*/
		
	}
}
