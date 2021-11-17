package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class DeleteEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter pw = resp.getWriter();

        pw.println(WebOutput.HTML_TOP);

        EmployeeDAO employeeDAO = EmployeeDAO.getEmployeeDAO();
        Employee employee = employeeDAO.getEmployee(Integer.parseInt(req.getParameter("id")));
        pw.println(
                String.format(WebOutput.DELETE_FORM,
                        employee.getId(),
                        employee.getName(),
                        employee.getEmail(),
                        employee.getGender(),
                        employee.getCountry()
                )
        );

        pw.println(WebOutput.HTML_BOTTOM);
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter pw = resp.getWriter();
        EmployeeDAO employeeDAO = EmployeeDAO.getEmployeeDAO();

        pw.println(WebOutput.HTML_TOP);

        employeeDAO.deleteEmployee(Integer.parseInt(req.getParameter("id")));

        pw.println("<h3>Employee Deleted</h3>");
        pw.println("<a class=\"btn btn-primary btn self-align-center m-2\" name=\"continue\" href=\"employees\">Continue</a>\n");

        pw.println(WebOutput.HTML_BOTTOM);
        pw.close();
    }
}
