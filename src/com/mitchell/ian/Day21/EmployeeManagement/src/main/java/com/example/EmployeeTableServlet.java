package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EmployeeTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter pw = resp.getWriter();
        EmployeeDAO employeeDAO = EmployeeDAO.getEmployeeDAO();

        pw.println(WebOutput.HTML_TOP);
        pw.println("<div class=\"row\">\n" +
                "<div class=\"d-flex justify-content-start mr-auto p-2\">\n" +
                "<h3 class=\"p-2 self-align-center\">Employees</h3>\n" +
                "</div>\n" +
                "<div class=\"d-flex justify-content-end p-2\">\n" +
                "<a class=\"btn btn-primary btn self-align-center m-2\" name=\"add\" href=\"add\">Add New Employee</a>\n" +
                "</div>\n" +
                "</div>" +
        "");

        //display employees in a table
        pw.println(WebOutput.EMPLOYEE_TABLE_TOP);
        List<Employee> employeeList = employeeDAO.getEmployees();
        for(Employee e : employeeList){
            pw.println(WebOutput.getEmployeeTableRow(e));
            System.out.println(e);
        }
        pw.println(WebOutput.EMPLOYEE_TABLE_BOTTOM);

        pw.println(WebOutput.HTML_BOTTOM);
        pw.close();
    }
}
