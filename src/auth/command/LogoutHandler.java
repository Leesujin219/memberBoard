package auth.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.controller.CommandHandler;

public class LogoutHandler implements CommandHandler{
	//get post 상관없이 처리 . get방식밖에 없음
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
		res.sendRedirect(req.getContextPath()+"/index.jsp");		
		return null;
	}	

}
