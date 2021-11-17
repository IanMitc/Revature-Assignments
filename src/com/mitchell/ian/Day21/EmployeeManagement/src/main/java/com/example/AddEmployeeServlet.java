package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class AddEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter pw = resp.getWriter();

        pw.println(WebOutput.HTML_TOP);

        if (req.getParameter("id") == null) {
            pw.println(String.format(WebOutput.ADD_EMPLOYEE_FORM, "", "", "", "", "", ""));
        } else {
            EmployeeDAO employeeDAO = EmployeeDAO.getEmployeeDAO();
            Employee employee = employeeDAO.getEmployee(Integer.parseInt(req.getParameter("id")));
            pw.println(
                    String.format(WebOutput.ADD_EMPLOYEE_FORM,
                            employee.getName(),
                            employee.getEmail(),
                            employee.getGender() == Employee.Gender.MALE ? "checked" : "",
                            employee.getGender() == Employee.Gender.FEMALE ? "checked" : "",
                            employee.getGender() == Employee.Gender.OTHER ? "checked" : "",
                            employee.getCountry()
                    )
            );
        }

        pw.println(WebOutput.HTML_BOTTOM);
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter pw = resp.getWriter();
        EmployeeDAO employeeDAO = EmployeeDAO.getEmployeeDAO();

        pw.println(WebOutput.HTML_TOP);

        Employee employee = new Employee(req.getParameter("name"),
                req.getParameter("email"),
                req.getParameter("country"),
                Employee.Gender.valueOf(req.getParameter("gender").toUpperCase(Locale.ROOT))
        );
        System.out.println(employee);

        employeeDAO.saveOrUpdateEmployee(employee);

        pw.println("<h3>Employee Saved</h3>");
        pw.println("<a class=\"btn btn-primary btn self-align-center m-2\" name=\"continue\" href=\"employees\">Continue</a>\n");

        pw.println(WebOutput.HTML_BOTTOM);
        pw.close();
    }
}
