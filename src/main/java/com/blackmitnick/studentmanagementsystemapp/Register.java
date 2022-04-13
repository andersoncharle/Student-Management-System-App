package com.blackmitnick.studentmanagementsystemapp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Register", value = "/Register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String fName = req.getParameter("fname");
        String lName=req.getParameter("lname");
        String email= req.getParameter("email");
        String userName=req.getParameter("username");
        String password= req.getParameter("password");
        String confirmPassword= req.getParameter("confirm");

        PrintWriter out = res.getWriter();
        out.println("<html>" +
                "<head>" +
                "<style>" +
                "ul{" +
                "background-color:lightgreen;list-style-type:none;padding:10px;margin:0 auto;" +
                "}" +
                "li{" +
                "padding:10px;border:2px solid gray;" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>");
        out.println("<ul>"+
                "<li>" + fName + "</li>" +
                "<li>" + lName + "</li>" +
                "<li>" + email + "</li>" +
                "<li>" + userName + "</li>" +
                "<li>" + password + "</li>" +
                "<li>" + confirmPassword + "</li>" +
                "</ul>");
        out.println("</body></html>");


    }


}

