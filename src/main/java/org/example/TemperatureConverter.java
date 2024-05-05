package org.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

//the HttpServlet is an abstract class that provides methods, such as doGet and doPost
//for handling the HTTP requests
public class TemperatureConverter extends HttpServlet {
    //this doGet method is called by the server and used to handle a GET request.
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //This line sets the content type of the response to "text/html", which tells the browser
        //that the data coming from the server is in HTML format.
        response.setContentType("text/html");
        PrintWriter out = response.getWriter(); //This line gets a PrintWriter object that can send character text to the client.
        String title = "Temperature Converter";

        double celsius = Double.parseDouble(request.getParameter("celsius"));
        double fahrenheit = celsius * 9/5 + 32;

        out.println("<!DOCTYPE HTML>\n" +
                            "<HTML>\n" +
                            "<HEAD><TITLE>" + title + "</TITLE>" +
                            "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                            "</HEAD>\n" +
                            "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                            "<H1>" + title + "</H1>\n" +
                            "  <P>Temperature in Celsius: " +
                            celsius + "\n" +
                            "  <P>Temperature in Fahrenheit: " +
                            fahrenheit +
                            "</BODY></HTML>");
    }
}