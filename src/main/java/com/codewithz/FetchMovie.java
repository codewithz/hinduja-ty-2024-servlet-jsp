package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/fetch-movie")
public class FetchMovie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";
            Connection con= DriverManager.getConnection(url,user,password);
            String query="Select * from movies where id=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                int movieId=rs.getInt("id");
                String name=rs.getString("name");
                String actor=rs.getString("actor");
                String actress=rs.getString("actress");
                String director=rs.getString("director");
                String releaseDate=rs.getString("release_date");
                float rating=rs.getFloat("rate_point");

                out.println("<html><body>");
                out.println("<h1>Movie Details</h1>");
                out.println("<table border='1' style='border-collapse: collapse; width: 100%; text-align: left;'>");
                out.println("<thead>");
                out.println("<tr>");
                out.println("<th>ID</th>");
                out.println("<th>Name</th>");
                out.println("<th>Actor</th>");
                out.println("<th>Actress</th>");
                out.println("<th>Director</th>");
                out.println("<th>Release Date</th>");
                out.println("<th>Rating</th>");
                out.println("</tr>");
                out.println("</thead>");
                out.println("<tbody>");
                out.println("<tr>");
                out.println("<td>" + id + "</td>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + actor + "</td>");
                out.println("<td>" + actress + "</td>");
                out.println("<td>" + director + "</td>");
                out.println("<td>" + releaseDate + "</td>");
                out.println("<td>" + rating + "</td>");
                out.println("</tr>");
                out.println("</tbody>");
                out.println("</table>");
                out.println("</body></html>");


            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
