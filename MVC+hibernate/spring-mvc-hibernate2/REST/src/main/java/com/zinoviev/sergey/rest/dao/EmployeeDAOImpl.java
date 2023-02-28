package com.zinoviev.sergey.rest.dao;

import com.zinoviev.sergey.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Employee where id=:EmployeeId").setParameter("EmployeeId", id).executeUpdate();
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", Employee.class).getResultList();
    }
}
