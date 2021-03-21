package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task4Servlet", value = "/Task4Servlet")
public class Task4Servlet extends HttpServlet {


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
                double result = (Math.pow(Math.tan(a), 1.0 / c)) / (1 + Math.sinh(b) / Math.log(Math.abs(d + c)));
                out.println(result);
                out.println("</body>");
                out.println("</html>");
            }

        } catch (NumberFormatException e) {
            response.sendError(400);
        }
    }
}
