package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Raskolnikov", 4, 7.25);
        Student st2 = new Student("Sonea", 2, 10.00);
        Student st3 = new Student("Babusea", 5, 8.75);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Method getStudents starts to work");
        System.out.println(studentList.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(studentList);
        return studentList;
    }
}
