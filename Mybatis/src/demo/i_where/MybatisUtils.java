package demo.i_where;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory sf;
	
	static {
		InputStream in = MybatisUtils.class.getClassLoader().getResourceAsStream("demo/i_where/conf.xml");
		sf = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSession openSession() {
		return sf.openSession(true);
	}
	
	
}
