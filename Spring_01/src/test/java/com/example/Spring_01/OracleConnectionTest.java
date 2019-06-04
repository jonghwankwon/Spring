package com.example.Spring_01;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	private static final Logger logger = LoggerFactory.getLogger(OracleConnectionTest.class);
	// 오라클 드라이버 설정
	private static final String DRIVER = "oracle.jdbc.OracleDriver";	
	private static final String URL = "jdbc:oracle:thin@localhost:1521/orcl";
	private static final String USER = "spring";
	private static final String PASSWD = "1234";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWD)){
			logger.info("오라클에 연결되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
