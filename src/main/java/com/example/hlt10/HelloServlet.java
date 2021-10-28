package com.example.hlt10;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        PrintWriter out = response.getWriter();
        out.println("<html><body><p>");
        out.println("First Name: "+firstName+"<br>");
        out.println("Last Name: "+lastName+"<br>");
        out.println("Email: "+email+"<br>");
        out.println("Password: "+password+"<br>");
        out.println("Confirm Password: "+confirmPassword+"<br>");
        out.println("</p></body></html>");
    }

    public void destroy() {
    }
}