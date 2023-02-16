package b_db_relation.oneToMany_uni;

import b_db_relation.oneToMany_uni.entity.Department;
import b_db_relation.oneToMany_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test2_OneToMany {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();


            //TODO Добавление
/*            Department department = new Department("HR", 1000, 10);

            Employee employee = new Employee( "Sergey", "Zinoviev", 600);
            Employee employee2 = new Employee( "Elena", "Smirnova", 1700);
            Employee employee3 = new Employee( "Sveta", "Lala", 1700);

            department.addNewEmployeeToDepartment(employee);
            department.addNewEmployeeToDepartment(employee2);
            department.addNewEmployeeToDepartment(employee3);
            session.save(department);*/


            //TODO Получение
/*            session.createQuery("update Employee set salary = 1000 where name = 'Alex'").executeUpdate();
            List<a_DB_action.entity.Employee> employeeList = session.createQuery("from Employee" +
                    " where name = 'Alex' and salary > 10").getResultList();*/

            //TODO Поиск по первой букве имени.   Следует использовать like и знак процентов
            List<Employee> employees = session.createQuery("from Employee where name like 'S%'").getResultList();
            employees.forEach(System.out::println);
            //Department department = session.get(Department.class, 3);
            //System.out.println(department);


            //TODO Удаление
/*            Department department = session.get(Department.class, 2);
            session.remove(department);*/



            session.getTransaction().commit();
        }
    }
}
