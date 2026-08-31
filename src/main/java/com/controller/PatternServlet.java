package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PatternServlet")
public class PatternServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Get data from JSP
        String symbol = req.getParameter("symbol");
        String rowsstr = req.getParameter("rows");
        String pattern = req.getParameter("ptr");

        int rows = Integer.parseInt(rowsstr);

        // Response type
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");

        // Check which pattern is selected
        if (pattern.equals("left")) {

            out.println("<h2>Left Triangle</h2>");

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {
                    out.print(symbol + " ");
                }

                out.println("<br>");
            }

        } else if (pattern.equals("right")) {

            out.println("<h2>Right Triangle</h2>");

            for (int i = 1; i <= rows; i++) {

                // Spaces
                for (int j = 1; j <= rows - i; j++) {
                    out.print("&nbsp;&nbsp;");
                }

                // Symbols
                for (int j = 1; j <= i; j++) {
                    out.print(symbol + " ");
                }

                out.println("<br>");
            }

        } else if (pattern.equals("triangle")) {

            out.println("<h2>Triangle</h2>");

            for (int i = 1; i <= rows; i++) {

                // Spaces
                for (int j = 1; j <= rows - i; j++) {
                    out.print("&nbsp;");
                }

                // Symbols
                for (int j = 1; j <= (2 * i - 1); j++) {
                    out.print(symbol);
                }

                out.println("<br>");
            }

        } else if (pattern.equals("inverted")) {

            out.println("<h2>Inverted Triangle</h2>");

            for (int i = rows; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {
                    out.print(symbol + " ");
                }

                out.println("<br>");
            }
        }

        out.println("</body>");
        out.println("</html>");
    }
}