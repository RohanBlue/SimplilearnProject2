package com.airport.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airport.model.Airports;
import com.airport.service.AirportsService;


/**
 * Servlet implementation class AddAirports
 */
@WebServlet("/AddAirports")
public class AddAirports extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAirports() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id=request.getParameter("txtAid");
		String name=request.getParameter("txtAname");
		String city=request.getParameter("txtAcity");
		String country=request.getParameter("txtAcountry");
		
		Airports air=new Airports();
		AirportsService as=new AirportsService();
		
		air.setAid(id);
		air.setAname(name);
		air.setAcity(city);
		air.setAcountry(country);
		as.addAirports(air);
		response.sendRedirect("AddAirports.jsp");

	

	}

}
