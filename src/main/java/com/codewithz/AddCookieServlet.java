package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-cookie")
public class AddCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String value=request.getParameter("value");

        Cookie cookie=new Cookie("my-data",value);
        response.addCookie(cookie);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet AddCookieServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b>my-data cookie has been added to the browser</b>");
        out.println("</body>");
        out.println("</html>");
    }
}
