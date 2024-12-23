package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dashboard")
public class DashBoardServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");

        out.println("<html>");
        out.println("<head>");

        out.println("<title>DashBoardServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to our Application :"+email+"</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
