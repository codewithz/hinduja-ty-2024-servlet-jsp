package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/name-length-servlet")
public class NameLengthServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        int length = name.length();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet NameLengthServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b> Length of "+name+"</b> is <i>"+length+"</i>");
        out.println("</body>");
        out.println("</html>");

        out.close();

    }
}
