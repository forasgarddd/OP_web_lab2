package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task6Servlet", value = "/Task6Servlet")
public class Task6Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Double a = Double.parseDouble(request.getParameter("a"));
            Double b = Double.parseDouble(request.getParameter("a"));
            Double c = Double.parseDouble(request.getParameter("a"));
            Double d = Double.parseDouble(request.getParameter("a"));

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head><title>Result</title></head>");
                out.println(" <body>");
                out.println("<h1> result = ");
                double result = (3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d)));
                out.println(result);
                out.println("</body>");
                out.println("</html>");
            }

        } catch (NumberFormatException e) {
            response.sendError(400);
        }
    }
}
