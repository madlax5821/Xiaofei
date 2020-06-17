package com.ascending.training.repository;

import com.ascending.training.model.Department;
import com.ascending.training.model.Employee;
import com.ascending.training.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public Employee save(Employee employee) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction() ;
            session.save(employee);
            session.close();
            return employee;
        }catch (Exception e) {
            if (transaction !=null) transaction.rollback();
            logger.error("failure to insert record",e);
            session.close();
            return null;
        }
    }

    @Override
    public List<Employee> getEmployees() {
        String hql = "SELECT e FROM Employee e";
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session s = sessionFactory.openSession();
        List<Employee> result = new ArrayList<>();
        try {
            Query query = s.createQuery(hql);
            result = query.list();
        }catch(HibernateException e){
            logger.error("session close exception try again...", e);
        }finally {
            s.close();
        }
        return result;
    }

    @Override
    public boolean delete(Employee employee) {
        String hql = "DELETE Employee as e where e.id = :Id";
        int deletedCount = 0;
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            transaction = session.beginTransaction();
            Query<Department> query = session.createQuery(hql);
            query.setParameter("Id", employee.getId());
            deletedCount = query.executeUpdate();
            transaction.commit();
            session.close();
            return deletedCount >= 1? true :false;
        }catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            session.close();
            logger.error("unable to delete record", e);
        }
        return false;
    }
}
