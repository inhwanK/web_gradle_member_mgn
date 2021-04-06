package web_gradle_member_mgn.service;

import java.util.List;

import web_gradle_member_mgn.dao.impl.MemberDaoImpl;
import web_gradle_member_mgn.ds.JndiDS;
import web_gradle_member_mgn.dto.Member;

public class MemberService {
	private MemberDaoImpl dao;
	
	public MemberService() {
		dao = MemberDaoImpl.getInstance();
		dao.setCon(JndiDS.getConnection());
	}

	public Member loginMembers(Member member){
		return dao.selectMemberById(member);
	}
	
	public void joinMember(Member member) {
		dao.insertMember(member);
	}
	
	public List<Member> showMembers() {
		return dao.selectMemberAll();
	}
	
	public void removeMember(String id) {
		dao.deleteMember(id);
	}
	
	public void modifyMember(Member member) {
		dao.updateMember(member);
	}
}
