package todolist.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todolist.model.todolistclass;

/**
 * Servlet implementation class Crossed_lab2
 */
@WebServlet("/Crossed")
public class Crossed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Crossed() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		List<todolistclass> entry = (List<todolistclass>) getServletContext().getAttribute("entry");
		List<todolistclass> crossentry = new ArrayList<todolistclass>();
getServletContext().setAttribute("crossentry", crossentry);
		for(todolistclass data : entry)
    	{
    		if(id==data.getId())
    		{
    			data.setF(true);
    		//	crossentry.add(new todolistclass_lab2(crossentry.size()+1,data.getName(),data.getDate(),false));
    		//	request.setAttribute("cross", entry);
    		}
    	}
    	request.getRequestDispatcher("todolistmain").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
