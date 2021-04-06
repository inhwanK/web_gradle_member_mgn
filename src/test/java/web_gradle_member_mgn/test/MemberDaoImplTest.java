package web_gradle_member_mgn.test;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import web_gradle_member_mgn.dao.impl.MemberDaoImpl;
import web_gradle_member_mgn.dto.Member;

public class MemberDaoImplTest {
	private static Connection con;
	private MemberDaoImpl dao;
	
	@BeforeClass	
	public static void setUpBeforeClass() throws Exception {
		con = JdbcUtil.getConnection();
	}

	@Before
	public void setup() {
		dao = MemberDaoImpl.getInstance();
		dao.setCon(con);

	}
	
	@Test
	public void testSelectMemberByIdSuccess() {
		System.out.println("testSelectMemberById()");
		Member member = new Member("1", "1111");
		Member memeberLogin = dao.selectMemberById(member);
		Assert.assertNotNull(memeberLogin);
		
	}
	
	@Test
	public void testSelectMemberByIdFail() {
		System.out.println("testSelectMemberById()");
		Member member = new Member("1", "1111");
		Member memeberLogin = dao.selectMemberById(member);
		Assert.assertNull(memeberLogin);
		
	}

	
}
