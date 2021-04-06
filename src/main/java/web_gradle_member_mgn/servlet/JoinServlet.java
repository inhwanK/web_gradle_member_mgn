package web_gradle_member_mgn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web_gradle_member_mgn.dto.Member;
import web_gradle_member_mgn.service.MemberService;

@WebServlet("/joinProcess")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;

	public JoinServlet() {
		service = new MemberService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		extracted(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		extracted(request, response);
	}

	private void extracted(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String state = "가입";
		HttpSession session = request.getSession();

		String id = request.getParameter("id");
		String passwd = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");

//		request.setAttribute("join", state);
		Member member = new Member(id, passwd, name, age, gender, email);
		service.joinMember(member);
		System.out.println(member);
		
		if (session.getAttribute("id").equals("admin")) {
			request.getRequestDispatcher("memberListServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		}
	}
}
