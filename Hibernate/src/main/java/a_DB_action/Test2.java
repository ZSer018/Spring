package a_DB_action;

import a_DB_action.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Employee employee = new Employee("Na23", "Str3123", "Stri3", 10);

        try {
            //TODO Получение строки таблмцы по индексу
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();


            int myId = employee.getId();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, myId);
            //session.getTransaction().commit();
            System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");

            System.out.println(employee1);


        } catch (Exception e) {
            sessionFactory.close();
        }


    }
}
