package com.example.Spring_01;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Junit 4.0으로 현재 클래스를 실행 시키기 위해
@RunWith(SpringJUnit4ClassRunner.class)

//Mybatis에서 참조하는 설정 파일의 위치를 알려주기 위해
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class MybatisTest {
	//로깅 처리를 위한 코드 생성
	private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	
	@Inject //Inject = 의존 관계 주입(스프링에서 객체를 생성해서 전달)
	//	즉. root-context.xml 파일안에 SqlSessionFactory 객체를 생성함
	//	그러므로 @Inject란 개념은 스프링에서 이미 만들어 놓은 객체를 가져다 사용한다는 뜻
	//	@AutoWired 이와 같은 기능을 합니다.
	private SqlSessionFactory sqlFactory;	// 
	
	@Test
	public void testFactory() {
		logger.info("sqlFactory : " + sqlFactory);
	}
	@Test
	public void testSession() {
		//mybatis 실행을 위한 SqlSession 객체 생성
		try(SqlSession sqlSession = sqlFactory.openSession()){
			logger.info("sqlSession : " + sqlSession);
			logger.info("myvatis 연결 성공");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
