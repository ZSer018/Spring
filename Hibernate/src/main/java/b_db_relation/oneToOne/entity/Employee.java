package b_db_relation.oneToOne.entity;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String department;

    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id") // TODO Здесь указывается колонка !!!!ЭТОЙ!!!! таблицы, которая является связующей на колонку другой таблицы.
    private Detail empdetail;

    public Employee(String name, String surname, String department, int salary, Detail empdetail) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.empdetail = empdetail;
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpdetail() {
        return empdetail;
    }

    public void setEmpdetail(Detail empdetail) {
        this.empdetail = empdetail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", empdetail=" + empdetail +
                '}';
    }
}
