package com.example.hiber_study;


import com.example.hiber_study.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberStudyApplicationTest2 {
    public static void main (String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Sidirov",
                    "HR", 100);

            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int myID = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myID);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!:)");
        }
        finally {
            factory.close();
        }
    }
}
