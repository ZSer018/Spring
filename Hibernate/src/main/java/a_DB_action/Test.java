package a_DB_action;

import a_DB_action.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", "yyyy", "1", 10));
        employeeList.add(new Employee("Alex", "tttt", "2", 11));
        employeeList.add(new Employee("Andry", "rrrr", "3String department", 12));
        employeeList.add(new Employee("Max", "eeee", "4String department", 13));
        employeeList.add(new Employee("Agnessa", "www", "5String department", 14));
        employeeList.add(new Employee("Anna", "qqq", "6", 15));
        employeeList.add( new Employee("Aleftina", "sds", "7", 16));
        employeeList.add( new Employee("Bill", "toto", "8", 17));
        employeeList.add(new Employee("John", "kokoko", "9g department", 18));
        employeeList.add(new Employee("Elsa", "lalala", "10 String department", 19));



/*        Employee employee = new Employee("Alex", "yyyy", "1", 10);
        Employee employee = new Employee("Alex", "tttt", "2", 11);
        Employee employee = new Employee("Andry", "rrrr", "3String department", 12);
        Employee employee = new Employee("Max", "eeee", "4String department", 13);
        Employee employee = new Employee("Agnessa", "www", "5String department", 14);
        Employee employee = new Employee("Anna", "qqq", "6", 15);
        Employee employee = new Employee("Aleftina", "sds", "7", 16);
        Employee employee = new Employee("Bill", "toto", "8", 17);
        Employee employee = new Employee("John", "kokoko", "9g department", 18);
        Employee employee = new Employee("Elsa", "lalala", "10 String department", 19);*/


            //TODO запись в базу
        try {
            session.beginTransaction();

            employeeList.forEach(session::save);

            session.getTransaction().commit();
        } catch (Exception e) {
            sessionFactory.close();
        }


    }
}
