import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    int counter = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        PrintWriter output = res.getWriter();
        String value = req.getParameter("name");

        counter++;

        if(value != null) {
            output.println("<h1>Hello, " + value + "! View count: "  + counter + "</h1>");
        } else output.println("<h1>Hello, world! View count: " + counter + "</h1>");

    }
}
