package iuh.fit.tuan01.nguyenhuynhngochai_22687251_tuan01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * @description
 * @author: Ngoc Hai
 * @date:
 * @version: 1.0
 */
@WebServlet(name = "bai05", value = "/bai-5")
public class Bai05 extends HttpServlet {
    private String name;
    private String username;
    private String email;
    private String password;
    private String facebook;
    private String shortBio;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        name = req.getParameter("first") + req.getParameter("last");
        username = req.getParameter("username");
        email = req.getParameter("email");
        password = req.getParameter("password");
        facebook = req.getParameter("facebook");
        shortBio = req.getParameter("shortBio");
        out.println("<html><body>");
        out.println("<h1>" + "Day la bai 5" + "</h1>");
        out.println("<h3> Name: " + name + "</h3>");
        out.println("<h3> Username: " + username + "</h3>");
        out.println("<h3> Email: " + email + "</h3>");
        out.println("<h3> Password: " + password + "</h3>");
        out.println("<h3> Facebook: " + facebook + "</h3>");
        out.println("<h3> Short bio: "  + shortBio + "</h3>");
        out.println("</body></html>");
    }

}
