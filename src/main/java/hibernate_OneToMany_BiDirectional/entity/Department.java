package hibernate_OneToMany_BiDirectional.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_Salary")
    private int maxSalary;

    @Column(name = "min_Salary")
    private int minSalary;

    @OneToMany(mappedBy = "employeeDepartment",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Employee> employees;

    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee emps) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(emps);
        emps.setEmployeeDepartment(this);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
