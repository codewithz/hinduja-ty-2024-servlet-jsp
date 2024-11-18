package com.codewithz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first-servlet")
public class MyFirstGenericServlet extends GenericServlet {

    public void service(ServletRequest request,ServletResponse response)
                    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>First Servlet</title></head><body>");
        out.println("<h1>Welcome to First Servlet</h1>");
        out.println("</body></html>");

        out.close();
    }
}
