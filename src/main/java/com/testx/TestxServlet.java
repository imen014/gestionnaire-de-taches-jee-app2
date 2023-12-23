package com.testx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testx.bddconnection.Connectionx;
import com.testx.bddconnection.CrudCreate;
import javax.servlet.annotation.WebServlet;



@WebServlet("/TestxServlet")
public class TestxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int id_tache = Integer.parseInt(request.getParameter("id_tache"));
		String description_tache = (String) request.getParameter("saisi_task");
		String etat_tache = (String) request.getParameter("state_task");
		
		Connectionx connect = new Connectionx();
		CrudCreate create_data = new CrudCreate(connect.connection);
		create_data.insert_data(id_tache, description_tache,etat_tache);
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/page_confirmation.jsp").forward(request, response);

	}

}
