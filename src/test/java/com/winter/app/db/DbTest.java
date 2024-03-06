package com.winter.app.db;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DbTest {
	@Autowired
	private DataSource dataSource;

	@Test
	void test() throws Exception {
		Connection con = dataSource.getConnection();
		assertNotNull(con);
	}

}
