package iuh.fit.tuan01.nguyenhuynhngochai_22687251_tuan01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * @description
 * @author: Ngoc  Hai
 * @date:
 * @version: 1.0
 */
@WebServlet(name = "bai04", value = "/bai-4", initParams = {
        @WebInitParam(name = "username", value = "ngochai"),

})
public class Bai04 extends HttpServlet {
    private String message;
    private String username;
    private String password;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        message = "Day la bai 4";
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + "Username: " + username + "</h2>");
        out.println("<h2>" + "Password: " + password + "</h2>");
        out.println("<h2>" + "Context param: " + this.getServletContext().getInitParameter("context-param") + "</h2>");
        out.println("</body></html>");

        out.flush();
        out.close();
    }
}