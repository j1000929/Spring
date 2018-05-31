package org.study.board;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataSourceTest {
	
@Inject
private DataSource ds;
private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);

@Test
public void testConnection() throws Exception{
	try(Connection con = ds.getConnection()) {
		
		System.out.println("connection:"+ con);
		logger.info(con.toString());
		logger.warn("DataconnetionTest warn:"+ con.toString());
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
