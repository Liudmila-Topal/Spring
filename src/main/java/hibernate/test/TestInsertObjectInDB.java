package hibernate.test;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInsertObjectInDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee newEmp = new Employee("Alexandr", "Ivanov", "IT", 800);
            session.beginTransaction();
            session.save(newEmp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
