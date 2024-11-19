package com.codewithz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/fetch-movie-in-range")
public class FetchMovieInRange extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");

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

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";
            Connection con= DriverManager.getConnection(url,user,password);
            String query="SELECT * FROM movies WHERE release_date >= ? AND release_date <= ?";

            PreparedStatement ps=con.prepareStatement(query);
            ps.setDate(1, java.sql.Date.valueOf(startDate));
            ps.setDate(2, java.sql.Date.valueOf(endDate));

            ResultSet rs=ps.executeQuery();


            while(rs.next()){
                System.out.println("Inside While");
                int movieId=rs.getInt("id");
                String name=rs.getString("name");
                String actor=rs.getString("actor");
                String actress=rs.getString("actress");
                String director=rs.getString("director");
                String releaseDate=rs.getString("release_date");
                float rating=rs.getFloat("rate_point");
                System.out.println(movieId+" "+name+" "+actor+" "+actress+" "+director+" "+releaseDate);

                out.println("<tr>");
                out.println("<td>" + movieId + "</td>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + actor + "</td>");
                out.println("<td>" + actress + "</td>");
                out.println("<td>" + director + "</td>");
                out.println("<td>" + releaseDate + "</td>");
                out.println("<td>" + rating + "</td>");
                out.println("</tr>");



            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("</body></html>");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
