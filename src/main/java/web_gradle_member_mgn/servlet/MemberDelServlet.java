package web_gradle_member_mgn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_member_mgn.service.MemberService;

@WebServlet("/MemberDelServlet")
public class MemberDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService service;
    
    public MemberDelServlet() {
        service = new MemberService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		service.removeMember(id);
		request.getRequestDispatcher("memberListServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
