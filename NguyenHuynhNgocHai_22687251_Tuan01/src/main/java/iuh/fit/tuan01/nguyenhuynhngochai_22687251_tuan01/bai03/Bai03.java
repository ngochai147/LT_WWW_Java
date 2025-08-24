package iuh.fit.tuan01.nguyenhuynhngochai_22687251_tuan01.bai03;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
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
@WebServlet(name = "bai3", urlPatterns = "/bai-3")
public class Bai03 extends HttpServlet {
    private  ObjectMapper objectMapper;
    @Override
    public void init(ServletConfig config) throws ServletException {
        objectMapper=new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        User user=new User("NgocHai","123456");
        String json=objectMapper.writeValueAsString(user);

        PrintWriter out = resp.getWriter();
        out.println(json);
    }
}
