package org.study.spring;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DataSourceTest {
	@Autowired
	DataSource ds;
	@Autowired
	SqlSessionFactory fac;
	
	@Test
	public void	 testConnection() throws Exception{
		
		try(Connection conn = ds.getConnection()){
			System.out.println(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSqlSessionFactoryBean() throws Exception {
		System.out.println(fac);
		
		try(SqlSession ses =	fac.openSession()){
			System.out.println(ses);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
