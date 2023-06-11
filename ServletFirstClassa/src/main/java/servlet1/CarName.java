package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CarName extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=req.getParameter("CarName");
	PrintWriter printwriter=res.getWriter();
	printwriter.print("your car name is:"+name);
	}

	
	
	
}
