package hibernate.hibernate_OneToMany_BiDirectional.test;

import hibernate.hibernate_OneToMany_BiDirectional.entity.Department;
import hibernate.hibernate_OneToMany_BiDirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestOneToMany {

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
            Department department = new Department("IT", 300, 1200);
            Employee employee1 = new Employee("Ivan", "Petrov", 800);
            Employee employee2 = new Employee("Elena", "Smirnova", 1000);
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

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void eagerMethod(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department: ");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department: " + department);
            System.out.println("Show employees of the department: " + department.getEmployees());

//            Department department = new Department("Sales", 2000, 800);
//            Employee employee1 = new Employee("Ivan", "Petrov", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 2000);
//            Employee employee3 = new Employee("Anton", "Sidorov", 1200);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            session.save(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
