package com.codewithz;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/palindrome-servlet")
public class PalindromeServlet extends GenericServlet {


    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();
        response.setContentType("text/html");

//        Accept the request
        String name=request.getParameter("name");
//        Process the Data
        StringBuffer stringBuffer=new StringBuffer(name);
        stringBuffer.reverse();
        String reversedString=stringBuffer.toString();

        if(name.equalsIgnoreCase(reversedString)){
            out.println("<h1>Palindrome</h1>");
        }
        else {
            out.println("<h1>Not a palindrome</h1>");
        }
//        Respond Back

        out.close();

    }
}
