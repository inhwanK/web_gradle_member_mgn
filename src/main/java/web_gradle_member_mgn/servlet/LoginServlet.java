package web_gradle_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web_gradle_member_mgn.dto.Member;
import web_gradle_member_mgn.service.MemberService;


@WebServlet("/loginProcess")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();
//	private CharacterEncodingFilter encoder = new CharacterEncodingFilter();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		String passwd = request.getParameter("pass");
		
		System.out.printf("id : %s , pass : %s", id, passwd);
		
		Member loginMember = new Member(id, passwd);
		Member result = service.loginMembers(loginMember);

		System.out.printf("loginMember : %s , result : %s", loginMember, result);
		
		if(result != null) {
			HttpSession session = request.getSession();
			session.setAttribute("id", result.getId());
			request.getRequestDispatcher("admin/main.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
