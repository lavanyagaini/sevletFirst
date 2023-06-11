package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import servlet1_dto.User;

public class UserDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("userName");
		String pwd=req.getParameter("password");
		
//		//pw.print(name);
//		pw.print("your result is:"+name);
//		pw.print("your result is:"+ pwd);
//		
		User user=new User();
		user.setUsername(name);
		user.setPassword(pwd);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(user);
		tx.commit();
		PrintWriter pw=res.getWriter();
		pw.print("success fully done");
		
	}

}
