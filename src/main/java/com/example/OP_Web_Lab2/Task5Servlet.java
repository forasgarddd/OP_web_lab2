package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task5Servlet", value = "/Task5Servlet")
public class Task5Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a,b,c,d,result;
        try {
            a = Double.parseDouble(request.getParameter("a"));
            b = Double.parseDouble(request.getParameter("b"));
            c = Double.parseDouble(request.getParameter("c"));
            d = Double.parseDouble(request.getParameter("d"));

            result = (2 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(-1 * Math.sqrt((c/d)))));
            request.getSession().setMaxInactiveInterval(60*48*60);
            request.setAttribute("res1",result);
            request.getSession().setAttribute("a1",a);
            request.getSession().setAttribute("b1",b);
            request.getSession().setAttribute("c1",c);
            request.getSession().setAttribute("d1",d);
        } catch (NumberFormatException e) {
            request.setAttribute("res1","Error");
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
