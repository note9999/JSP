package unit01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    int initCnt =1;
    int doGetCnt =1;
    int destroyCnt =1;
	
	public LifeCycle() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init메서드 호출:"+initCnt++);
	}

	public void destroy() {
		System.out.println("destroy메서드 호출:"+destroyCnt++);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출:"+doGetCnt++);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
