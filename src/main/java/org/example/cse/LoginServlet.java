package org.example.cse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Read form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Process : access to database, perform business logic

        // Build HTML code
        PrintWriter out = response.getWriter();

        String htmlResponse = "<html>";
        htmlResponse += "<h2> Your username is "+ username + "<br/>";
        htmlResponse += "<h2> Your password is "+ password + "<h2/>";
        htmlResponse += "</html>";

        out.println(htmlResponse);
    }

}
