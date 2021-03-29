package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task6Servlet", value = "/Task6Servlet")
public class Task6Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a,b,c,d,result;
        try {
            a = Double.parseDouble(request.getParameter("a"));
            b = Double.parseDouble(request.getParameter("b"));
            c = Double.parseDouble(request.getParameter("c"));
            d = Double.parseDouble(request.getParameter("d"));

            result = (3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d)));
            request.getSession().setMaxInactiveInterval(60*48*60);
            request.setAttribute("res",result);
            request.getSession().setAttribute("a",a);
            request.getSession().setAttribute("b",b);
            request.getSession().setAttribute("c",c);
            request.getSession().setAttribute("d",d);
        } catch (NumberFormatException e) {
            request.setAttribute("res","Error");
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
