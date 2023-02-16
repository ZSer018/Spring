package a_DB_action;

import a_DB_action.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test6 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            session.beginTransaction();

            //TODO Изменение записи
            Employee employee = session.get(Employee.class, 2);
            employee.setName("Elexa");
            employee.setDepartment("development");


            //TODO Изменение нескольких записей сразу
            session.createQuery("update Employee set salary = 1000 where name = 'Alex'").executeUpdate();

            session.getTransaction().commit();

        } catch (Exception e) {
            sessionFactory.close();
        }


    }
}
