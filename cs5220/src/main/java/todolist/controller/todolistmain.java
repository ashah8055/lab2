package todolist.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todolist.model.todolistclass;

@WebServlet("/todolistmain")
public class todolistmain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public todolistmain() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//DateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
		//Date date = new Date();
	//	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");      
		//Date dateWithoutTime = sdf.parse(sdf.format(new Date()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
	List<todolistclass> entry = new ArrayList<todolistclass>();
	try {
		entry.add(new todolistclass(entry.size()+1,"Take out trash",sdf.parse(sdf.format(new Date())),false));
		entry.add(new todolistclass(entry.size()+1,"Take  trash",sdf.parse(sdf.format(new Date())),false));
		entry.add(new todolistclass(entry.size()+1,"trash",sdf.parse(sdf.format(new Date())),false));
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	entry.add(new todolistclass_lab2(entry.size()+1,"trash",sdf.format(new Date()),false));

	getServletContext().setAttribute("entry", entry);
	
	}
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	request.getRequestDispatcher("WEB-INF/todolistmain_view.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("txtname");
		System.out.println(name);
	//Date date = new Date();
		@SuppressWarnings("unchecked")
	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<todolistclass> entry = (List<todolistclass>) getServletContext().getAttribute("entry");
		entry.add(new todolistclass(entry.size()+1,name,new Date()	,false));
		
		doGet(request,response);
		
		
	}

}
