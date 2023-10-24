package hibernate_OneToOne.test;

import hibernate_OneToOne.entity.Detail;
import hibernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestOneToOne {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Detail.class)
            .buildSessionFactory();

    Session session = null;

    @Test
    void insertEmployee() {
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Petrov", "Sales", 2555);
            Detail employeDetail = new Detail("Tbilisi", 123456789, "ivan.petrov@gmail.com");
            employee.setEmpDetail(employeDetail);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void getEmployee() {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void removeEmployee() {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void testBiDirections(){
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Nicolai", "Sidorov", "HR", 750);
            Detail employeDetail = new Detail("Moscow", 87541269, "nicolai.sidorov@gmail.com");
            employee.setEmpDetail(employeDetail);
            employeDetail.setEmployee(employee);

            session.beginTransaction();
            session.save(employeDetail);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
