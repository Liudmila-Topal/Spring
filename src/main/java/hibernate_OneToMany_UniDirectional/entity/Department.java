package hibernate_OneToMany_UniDirectional.entity;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_Id")
    private List<Employee> employees;

    public Department(String departmentName, int maxSalary, int minSalary){
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee emps){
        if (employees == null){
        employees = new ArrayList<>();
        }
        employees.add(emps);
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
