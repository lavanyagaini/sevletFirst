package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class sum extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		 String i=req.getParameter("number1");
		 String j=req.getParameter("number2");
		 int number1=Integer.parseInt(i);
		 int number2=Integer.parseInt(j);
		 int result=number1+number2;
		 PrintWriter pw=res.getWriter();
		 pw.print("your result is:"+ result);
	}
}

