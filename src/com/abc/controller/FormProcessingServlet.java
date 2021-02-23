package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String sname = request.getParameter("sname");

		String[] squals = request.getParameterValues("squal");

		String squal = "";
		for (String tempSqual : squals) {

			squal =squal+ tempSqual + "<br/>";
		}

		String sgen = request.getParameter("sgen");
		String[] scourses = request.getParameterValues("scourse");
		String scourse = "";
		for (String tempCourse : scourses) {
			scourse = scourse+ tempCourse + "<br/>";
		}
		String branch = request.getParameter("branch");
		String saddress = request.getParameter("saddress");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h1 style='color: red; text-align: center;'>Aradhya Brilliance\r\n" + "		Center</h1>");
		out.println("<h2 style='color: blue; text-align: center;'>Student Registration\r\n" + "		Page</h2>");

		out.println("<table border='1' align='center' bgcolor='violet'>");
		out.println("<tr><td>SNAME</td>   <td>" + sname + "</td></tr>");
		out.println("<tr><td>SQUAL</td>   <td>" + squal + "</td></tr>");
		out.println("<tr><td>SGEN</td>    <td>" + sgen + "</td></tr>");
		out.println("<tr><td>SCOURSE</td> <td>" + scourse + "</td></tr>");
		out.println("<tr><td>BRANCH</td>  <td>" + branch + "</td></tr>");
		out.println("<tr><td>ADDRESS</td> <td>" + saddress + "</td></tr>");

		out.println("</table>");

		out.println("<br/><br/>");
		out.println("<h3 style='color:red;text-align:center'><a href='./index.html'>|indexpage|</a></h3>");
		out.println("</body></html>");

		out.close();

	}

}
