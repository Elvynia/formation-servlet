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
	 * Point d'entrée de la requête HTTP envoyée par le client (navigateur).
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupération d'un objet permettant d'écrire dans la réponse renvoyée
		// au client.
		final Writer writer = response.getWriter();
		// Ecriture de chaînes de caractères dans le buffer d'un flux
		// représentant le corps de la réponse HTTP.
		writer.append("<html><body>");
		writer.append("<h2>Mon pronostique : France 1 - Australie 0</h2>");
		writer.append("</body></html>");
		// Flush permet de "vider" le buffer permettant l'écriture réelle dans
		// le flux de la réponse.
		writer.flush();
	}
}
