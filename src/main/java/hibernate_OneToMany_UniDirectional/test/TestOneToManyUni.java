package hibernate_OneToMany_UniDirectional.test;

import hibernate_OneToMany_UniDirectional.entity.Department;
import hibernate_OneToMany_UniDirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestOneToManyUni {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Department.class)
            .buildSessionFactory();
    Session session = null;

    @Test
    void addEmployee() {
        try {
            session = factory.getCurrentSession();
            Department department = new Department("HR", 1500, 500);
            Employee employee1 = new Employee("Oleg", "Ivanov", 600);
            Employee employee2 = new Employee("Andrei", "Sidorov", 900);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void getDepartmentsEmp(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 2);
            System.out.println(department);
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void getEmployeeInfo(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void deleteEmployee(){
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
    void deleteDepartment(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            session.delete(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
