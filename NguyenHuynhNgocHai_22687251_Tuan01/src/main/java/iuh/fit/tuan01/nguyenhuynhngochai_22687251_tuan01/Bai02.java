package iuh.fit.tuan01.nguyenhuynhngochai_22687251_tuan01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai2", urlPatterns = "/bai-2")
public class Bai02 extends HttpServlet {
    private String message;
    private String message2;
    public void init () {
        message = "Day la bai 2";
        message2 = "cua Ngoc Hai";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1 style='color: blue'>" + message + "</h1>");
        out.println("<div>" + message2 + "</div>");
    }
}