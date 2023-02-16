package b_db_relation.oneToOne;

import b_db_relation.oneToOne.entity.Detail;
import b_db_relation.oneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_oneToOne {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            //TODO Внесение записей в базу данных в 2 таблицы : Employees и Details
            /*List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("Alex", "yyyy", "1", 10, new Detail("ekb", "293485478", "lalala@mail.com")));
            employeeList.add(new Employee("Alex", "tttt", "2", 11, new Detail("msc", "293485478", "dsdsdsds@mail.com")));
            employeeList.add(new Employee("Andry", "rrrr", "3String department", 12, new Detail("kzn", "293485478", "zizizi@mail.com")));
            employeeList.add(new Employee("Max", "eeee", "4String department", 13, new Detail("spb", "293485478", "fufufu@mail.com")));
            employeeList.add(new Employee("Agnessa", "www", "5String department", 14, new Detail("sch", "293485478", "kokoko@mail.com")));
            employeeList.add(new Employee("Anna", "qqq", "6", 15, new Detail("nyy", "293485478", "nanana@mail.com")));
            employeeList.forEach(session::save);*/


            //TODO чтение записи из базы
            Employee employee = session.get(Employee.class, 3);
            System.out.println(employee);


            //TODO удаление записи из базы
            session.remove(employee);


            session.getTransaction().commit();
        }
    }
}
