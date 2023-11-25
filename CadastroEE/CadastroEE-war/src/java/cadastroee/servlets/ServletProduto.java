/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cadastroee.servlets;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class ServletProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private ProdutoFacadeLocal facade;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Recupera a lista de produtos usando o facade
        List<Produto> produtos = facade.obterTodosProdutos();

        // Configura o tipo de conteúdo da resposta
        response.setContentType("text/html");

        // Escreve a resposta HTML
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Lista de Produtos</title></head>");
        out.println("<body>");
        out.println("<h2>Lista de Produtos</h2>");
        out.println("<ul>");

        // Itera sobre a lista de produtos e os adiciona à lista HTML
        for (Produto produto : produtos) {
            out.println("<li>" + produto.getNome() + " - " + produto.getPreco() + "</li>");
        }

        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
