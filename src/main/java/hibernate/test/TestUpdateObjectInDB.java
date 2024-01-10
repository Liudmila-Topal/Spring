package hibernate.test;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestUpdateObjectInDB {

    @Test
    void getObjectWithQuery() {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(1500);

            session.createQuery("UPDATE Employee set salary = 1000 where name = 'Alexandr'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
