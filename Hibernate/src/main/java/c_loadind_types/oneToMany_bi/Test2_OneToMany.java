package c_loadind_types.oneToMany_bi;


import c_loadind_types.oneToMany_bi.entity.Department;
import c_loadind_types.oneToMany_bi.entity.Employee;
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


            //TODO Сохранение
/*            Department department = new Department("IT", 1000, 10);
            Employee employee = new Employee( "Sergey", "Zinoviev", 400);
            Employee employee2 = new Employee( "Anton", "S", 700);
            Employee employee3 = new Employee( "Elena", "V", 700);
            Employee employee4 = new Employee( "Katerina", "O", 700);

            department.addNewEmployeeToDepartment(employee);
            department.addNewEmployeeToDepartment(employee2);
            session.save(department);

            employee3.setDepartment(department);
            employee4.setDepartment(department);
            session.save(employee3);
            session.save(employee4);*/


            //TODO Получение
            Department department = session.get(Department.class,1);
            System.out.println(department);
            System.out.println("------------------------");
            System.out.println(department.getEmployeeList());



            //TODO Удаление работника. Удалится нормально, так как это зависимая таблица, потому что она МЭНИ
/*            Employee employee = session.get(Employee.class, 3);
            System.out.println(employee);
            session.remove(employee);*/


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
