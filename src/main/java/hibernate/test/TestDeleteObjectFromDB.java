package hibernate.test;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestDeleteObjectFromDB {

    @Test
    void deleteObjectFromDB() {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);

            session.createQuery("DELETE Employee where name = 'Alexandr'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
