package web_gradle_member_mgn.dao;

import java.util.List;

import web_gradle_member_mgn.dto.Member;

public interface MemberDao {
	Member selectMemberById(Member member);
	
	int insertMember(Member member);
	
	List<Member> selectMemberAll();
	
	int deleteMember(String id);
	
	int updateMember(Member member);
}
