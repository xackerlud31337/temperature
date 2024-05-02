package org.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TemperatureConverter extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
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