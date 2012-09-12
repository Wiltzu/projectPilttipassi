package fi.nottingham.pilttipassi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.nottingham.pilttipassi.service.UserDaoTestService;

/**
 * Servlet implementation class firstServlet
 */
@Controller
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserDaoTestService userDaoTestService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @RequestMapping(value="/firstServlet", method={RequestMethod.GET})
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().print("HURRDURR!");
		response.getOutputStream().println("outputstream");
		response.getOutputStream().println("outputstream2");
		
		String gottenUserName = userDaoTestService.doDBShit("testi");
		
		response.getOutputStream().println(gottenUserName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
