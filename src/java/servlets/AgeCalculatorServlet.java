package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge = request.getParameter("currentAge");
        request.setAttribute("currentAge", currentAge);
        
        try{
            int inputAge = Integer.parseInt(currentAge);
            inputAge++;
            request.setAttribute("message", "Your age next birthday will be " + inputAge);
        }
        catch (NumberFormatException notAge) {
            request.setAttribute("message", "You must give your current age");
            
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
