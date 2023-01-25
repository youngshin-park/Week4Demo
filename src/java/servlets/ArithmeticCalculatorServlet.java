package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String calculate = request.getParameter("calculate");
        
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("socondNumber", secondNumber);
        
        try {
            int a = Integer.parseInt(firstNumber);
            int b = Integer.parseInt(secondNumber);
            int result = 0;
            
            if(calculate.equals("+")) {
                result = a + b;
            }
            else if(calculate.equals("-")) {
                result = a - b;
            }
            else if(calculate.equals("*")) {
                result = a * b;
            }
            else {
                result = a % b;
            }
            request.setAttribute("result", result);
        }
        catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }


}
