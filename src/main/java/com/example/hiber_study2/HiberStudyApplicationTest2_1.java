package com.example.hiber_study2;

import com.example.hiber_study2.entity.Detail;
import com.example.hiber_study2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberStudyApplicationTest2_1 {
    public static void main (String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Natalia", "Kukushkina", "IT", 500);
//            Detail detail = new Detail("Nsk", "8913445454", "para");

//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);

//            session.getTransaction().commit();
//            System.out.println("Done!:)");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "89138956523", "gaga");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!:)");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!:)");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!:)");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}