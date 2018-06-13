package fr.gtm.tp.pronostic;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PronoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Point d'entr�e de la requ�te HTTP envoy�e par le client (navigateur).
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		// R�cup�ration d'un objet permettant d'�crire dans la r�ponse renvoy�e
		// au client.
		final Writer writer = response.getWriter();
		// Ecriture de cha�nes de caract�res dans le buffer d'un flux
		// repr�sentant le corps de la r�ponse HTTP.
		writer.append("<html><body>");
		writer.append("<h2>Mon pronostique : France 1 - Australie 0</h2>");
		writer.append("</body></html>");
		// Flush permet de "vider" le buffer permettant l'�criture r�elle dans
		// le flux de la r�ponse.
		writer.flush();
	}
}
