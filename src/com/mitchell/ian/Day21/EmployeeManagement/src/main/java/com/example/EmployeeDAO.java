package com.example;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

public class EmployeeDAO {
    private static EmployeeDAO employeeDAO = null;
    private Configuration configuration;
    private SessionFactory factory;


    private EmployeeDAO() {
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        factory = configuration.buildSessionFactory();
    }

    public static EmployeeDAO getEmployeeDAO() {
        if (employeeDAO == null) {
            employeeDAO = new EmployeeDAO();
        }
        return employeeDAO;
    }

    public Employee getEmployee(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = (Employee) session.get(Employee.class, id);

        transaction.commit();
        session.close();

        return employee;
    }

    public List<Employee> getEmployees() {
        Session session = factory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> rootEntry = cq.from(Employee.class);
        CriteriaQuery<Employee> all = cq.select(rootEntry);

        TypedQuery<Employee> allQuery = session.createQuery(all);
        List<Employee> results = allQuery.getResultList();

        session.close();
        return results;
    }

    public void saveOrUpdateEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(employee);

        transaction.commit();
        session.close();
    }

    public void updateEmployee(Employee e) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(e);

        transaction.commit();
        session.close();
    }

    public void deleteEmployee(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = getEmployee(id);

        session.delete(employee);

        transaction.commit();
        session.close();
    }
}
