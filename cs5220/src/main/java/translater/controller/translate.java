package translater.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import translater.model.translate_class;

/**
 * Servlet implementation class translate
 */
@WebServlet("/translate")
public class translate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override
  
 
  public void init() throws ServletException {
	  List<translate_class> word = new ArrayList<translate_class>();
		ServletContext context = getServletContext();
		String fileName = context.getRealPath("/WEB-INF/dicternary.txt");

		
		
	
			String line = null;

			FileReader fileReader = null;
			try {
				fileReader = new FileReader(fileName);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				while ((line = bufferedReader.readLine()) != null)
				{

					if (line.length() > 0) {

						if (line.charAt(0) == '#') 
						{
							// ignore
						} else
						{
							String temp[] = line.split("\t");
							word.add(new translate_class(word.size()+1,temp[0],temp[1]));
							
						System.out.println(temp[0]);
						System.out.println(temp[1]);
						getServletContext().setAttribute("word", word);
						}
						}			
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
  }
	
	public translate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.getRequestDispatcher("WEB-INF/translater.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		List<translate_class> word = (List<translate_class>) getServletContext().getAttribute("word");
		String engword = request.getParameter("txtsearch");
		System.out.println(engword);
		for(translate_class entry: word)
		{
			if(entry.getEnglish().equals(engword))
			{

				request.setAttribute("match_english",entry.getEnglish());
				request.setAttribute("match_spanish",entry.getSpanish());
			request.getRequestDispatcher("WEB-INF/resulttranslate.jsp").forward(request, response);
						
			}
			
		}
		
		doGet(request, response);
	

		}
}
