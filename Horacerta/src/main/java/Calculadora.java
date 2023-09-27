import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class Calculadora extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));

            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;
            
            // Verifique se o segundo número não é zero antes de realizar a divisão
            int divisao = numero2 != 0 ? numero1 / numero2 : 0;
            
            int resto = numero2 != 0 ? numero1 % numero2 : 0;

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado:</h1>");
            out.println("<p>Num1: " + numero1 + "</p>");
            out.println("<p>Num2: " + numero2 + "</p>");
            out.println("<p>Soma: " + soma + "</p>");
            out.println("<p>Subtração: " + subtracao + "</p>");
            out.println("<p>Multiplicação: " + multiplicacao + "</p>");
            out.println("<p>Divisão: " + divisao + "</p>");
            out.println("<p>Resto: " + resto + "</p>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("<p>Por favor, insira números inteiros válidos.</p>");
        } finally {
            out.close();
        }
}
}
