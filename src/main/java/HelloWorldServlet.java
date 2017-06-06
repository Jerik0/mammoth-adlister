import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        PrintWriter output = res.getWriter();
        String value = req.getParameter("name");

        if(value != null) {
            output.println("<h1>Hello, " + value + "!</h1>");
        } else output.println("<h1>Hello, world!</h1>");

    }
}
