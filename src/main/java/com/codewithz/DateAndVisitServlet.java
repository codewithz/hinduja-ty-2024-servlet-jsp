package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/date-and-visit-servlet")
public class DateAndVisitServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        Integer visitNumber = (Integer) session.getAttribute("visitNumber");
        Date lastVisited = (Date) session.getAttribute("lastVisited");
        if(lastVisited == null || visitNumber == null) {
            out.println("<h1>Welcome this is your first visit</h1>");
            visitNumber = new Integer(1);
        }else {
            visitNumber = new Integer(visitNumber.intValue() + 1);
            out.println("<h1> Welcome Back, Visit Number :"+visitNumber.intValue()+" Last Visited: " + lastVisited.toString() + "</h1>");

        }
        lastVisited = new Date();
        session.setAttribute("lastVisited", lastVisited);
        session.setAttribute("visitNumber", visitNumber);
        out.close();
    }
}
