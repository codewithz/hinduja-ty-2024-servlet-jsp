package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirection-servlet")
public class RedirectionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        int number = Integer.parseInt(request.getParameter("number"));

        if (number %2==0) {
            response.sendRedirect("http://www.hindujacollege.in");
        }else{
            response.sendRedirect("http://www.codewithz.com");
        }
    }
}
