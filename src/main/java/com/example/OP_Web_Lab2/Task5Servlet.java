package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task5Servlet", value = "/Task5Servlet")
public class Task5Servlet extends HttpServlet {


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
                double result = (2 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(-1 * Math.sqrt((c/d)))));
                out.println(result);
                out.println("</body>");
                out.println("</html>");
            }

        } catch (NumberFormatException e) {
            response.sendError(400);
        }
    }
}
