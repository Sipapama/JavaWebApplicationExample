package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Actividad 1 - Servlets</title></head>");
		out.println("<body>");
		out.println("<h1>Solicitud nombre</h1>");
		out.println("<form action=\"/myServlet2\" method\"get\">");
		out.println("<label for=\"vNombre\">Escribe tu nombre:</label><br>");
		out.println("<input type=\"text\" id=\"vNombre\" name=\"vNombre\"><br>");
		out.println("<p>Pulse el botón para enviar</p>");
		out.println("<input type=\"submit\" value=\"Enviar\">");
		out.println("</form>");
		out.println("</body></html>");
	}

}