package fr.wcs.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/montest")
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Writer w = resp.getWriter();
		w.append("<html>");
		w.append("<body>");
		w.append("<h1>Ma super servlet !</h1>");
		w.append("</body>");
		w.append("</html>");
		w.flush();
	}
}
