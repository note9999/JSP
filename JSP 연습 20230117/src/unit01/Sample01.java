package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Sampe01
 */
@WebServlet("/Sample01")
public class Sample01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//바이너리(이진수), 바이트 형식으로 입출력 하는것이 아니라 문자를 입출력 하기때문에 PrintStream사용
		// PrintStream은 문자(다국어) 사용하기 번거러움
		// printWriter는 비교적 쉬워서 이것을 사용
		PrintWriter out= response.getWriter();
		for (int i = 0; i < 10; i++) {
			out.print("<h1>hello doget</h1>");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost호출");
	}

}
