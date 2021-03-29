package com.example.OP_Web_Lab2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.Math;

@WebServlet(name = "Task4Servlet", value = "/Task4Servlet")
public class Task4Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a,b,c,d,result;
        try {
            a = Double.parseDouble(request.getParameter("a"));
            b = Double.parseDouble(request.getParameter("b"));
            c = Double.parseDouble(request.getParameter("c"));
            d = Double.parseDouble(request.getParameter("d"));

            result = Math.pow(4 * Math.cosh( Math.sqrt( Math.abs(a/b) ) )+3 * Math.acos(d), c);
            request.getSession().setMaxInactiveInterval(60*48*60);
            request.setAttribute("res2",result);
            request.getSession().setAttribute("a2",a);
            request.getSession().setAttribute("b2",b);
            request.getSession().setAttribute("c2",c);
            request.getSession().setAttribute("d2",d);
        } catch (NumberFormatException e) {
            request.setAttribute("res2","Error");
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
