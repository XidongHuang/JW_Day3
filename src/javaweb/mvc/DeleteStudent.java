package javaweb.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("toGet method1...");
		
		String flowId = request.getParameter("flowId");
		System.out.println("toGet method2..."+ (flowId==null));
		StudentDAO studentDAO = new StudentDAO();
		System.out.println("toGet method3..."+ Integer.parseInt(flowId));
		studentDAO.deleteByFlowId(Integer.parseInt(flowId));
		System.out.println(flowId);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
		
	}

}
