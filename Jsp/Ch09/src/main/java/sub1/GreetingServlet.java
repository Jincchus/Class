package sub1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting.do")
public class GreetingServlet extends HttpServlet{
	private static final long serialVersionUID = 3L;
	@Override
	public void init() throws ServletException {
		System.out.println("GreetingServlet init()...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 // 클라이언트의 GET 요청할 때
        System.out.println("GreetingServlet doGet()...");

        // HTML 출력
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.print("<html>");
        writer.print("<head>");
        writer.print("<meta charset='UTF-8'>");
        writer.print("<title>GreetingServlet</title>");
        writer.print("</head>");
        writer.print("<body>");
        writer.print("<h3>HelloServlet</h3>");
        writer.print("<a href='./1_Servlet.jsp'>서블릿 메인</a>");
        writer.print("<a href='./greeting.do'>GreetingServlet</a>");
        writer.print("</body>");
        writer.print("</html>");
        writer.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GreetingServlet doPost()...");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("GreetingServlet destroy()...");
	}

}
