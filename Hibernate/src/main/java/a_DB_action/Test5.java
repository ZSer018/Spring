package a_DB_action;

import a_DB_action.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            session.beginTransaction();

            //TODO Получение списка строк таблицы по параметрам
            List<Employee> employeeList = session.createQuery("from Employee" +
                    " where name = 'Alex' and salary > 10").getResultList();
            employeeList.forEach(System.out::println);

            session.getTransaction().commit();

        } catch (Exception e) {
            sessionFactory.close();
        }


    }
}
