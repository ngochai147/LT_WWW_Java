package iuh.fit.tuan01.nguyenhuynhngochai_22687251_tuan01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai04",value = "bai-04")
public class Bai04 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer=resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>"+ this.getServletConfig().getInitParameter("username")+"</h2>");
        writer.println("</body></html>");
    }
}
