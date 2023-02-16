package a_DB_action;

import a_DB_action.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test7 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            Employee employee1 = new Employee("Lora", "Yoooo", "HR", 13000);
            session.save(employee1);
            System.out.println(employee1.getId());
            session.getTransaction().commit();

/*            //TODO Удаление записи
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee2 = session.get(Employee.class, employee1.getId());
            session.delete(employee2);
            session.getTransaction().commit();*/


            //TODO Удаление записей
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete from Employee where name = 'Lora'").executeUpdate();
            session.getTransaction().commit();


        } catch (Exception e) {
            sessionFactory.close();
        }


    }
}
