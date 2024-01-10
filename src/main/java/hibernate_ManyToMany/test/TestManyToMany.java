package hibernate_ManyToMany.test;

import hibernate_ManyToMany.entity.Child;
import hibernate_ManyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestManyToMany {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Child.class)
            .addAnnotatedClass(Section.class)
            .buildSessionFactory();
    Session session = null;

    @Test
    void addChildToSection() {
        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Football");
            Child child1 = new Child("Vasilii", 5);
            Child child2 = new Child("Elena", 4);
            Child child3 = new Child("Ivan", 6);
            Child child4 = new Child("Dima", 5);
            Child child5 = new Child("Anatolii", 6);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);
            section1.addChildToSection(child4);
            section1.addChildToSection(child5);

            session.beginTransaction();
            session.persist(section1);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void addSectionToChild(){
        try {
            session = factory.getCurrentSession();
            Section section2 = new Section("Volleyball");
            Section section3 = new Section("Chess");
            Section section4 = new Section("Dance");
            Child child1 = new Child("Igor", 7);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);
            child1.addSectionToChild(section4);

            session.beginTransaction();
            session.persist(child1);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void getSectionInfo(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void getChildInfo(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 6);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    void removeSection(){
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section = session.get(Section.class, 6);
            session.delete(section);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
