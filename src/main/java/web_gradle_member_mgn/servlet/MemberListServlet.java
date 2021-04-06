package web_gradle_member_mgn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_member_mgn.dto.Member;
import web_gradle_member_mgn.service.MemberService;


@WebServlet("/memberListServlet")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService service;
    
    public MemberListServlet() {
        service = new MemberService();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Member> result = service.showMembers();
		request.setAttribute("result", result);
		
		
		request.getRequestDispatcher("admin/member_list.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
