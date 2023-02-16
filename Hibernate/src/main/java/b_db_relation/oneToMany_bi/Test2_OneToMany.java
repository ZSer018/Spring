package b_db_relation.oneToMany_bi;


import b_db_relation.oneToMany_bi.entity.Department;
import b_db_relation.oneToMany_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2_OneToMany {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();


/*

            Department department = new Department("Sell", 1000, 10);
            Employee employee = new Employee( "Sergey", "Zinoviev", 400);
            // employee.setDepartment(department);
            Employee employee2 = new Employee( "Elena", "Smirnova", 700);
            //   employee2.setDepartment(department);

            session.save(department);
            session.save(employee);
            session.save(employee2);
*/




            //TODO Удаление работника. Удалится нормально, так как это зависимая таблица, потому что она МЭНИ
            Employee employee = session.get(Employee.class, 3);
            System.out.println(employee);
            session.remove(employee);


/*            //TODO  удаление департамента. Удалится вместе с работниками если каскад = all .  В противном случае не удалится вообще
            Department department = session.get(Department.class, 1);
            session.remove(department);*/



            //employee.setDepartment(department);
/*            department.addNewEmployeeToDepartment(employee);
            department.addNewEmployeeToDepartment(employee2);
            session.save(department);*/

            session.getTransaction().commit();
        }
    }
}
