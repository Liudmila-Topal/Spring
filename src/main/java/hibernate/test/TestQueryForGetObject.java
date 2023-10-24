package hibernate.test;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestQueryForGetObject {

    @Test
    void getObjectWithQuery() {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employeeList = session.createQuery("FROM Employee").getResultList();
            List<Employee> employeesName = session.createQuery("FROM Employee " + "WHERE name = 'Alexandr'")
                    .getResultList();
            List<Employee> employeesSalary = session.createQuery("FROM Employee " + "WHERE name = 'Alexandr'" +
                    "AND salary <= 800").getResultList();

            for (Employee employee : employeesSalary) {
                System.out.println(employee);
            }
            session.getTransaction().commit();
        }
    }
}
