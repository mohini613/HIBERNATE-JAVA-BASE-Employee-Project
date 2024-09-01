package com.empPro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmpProMain {

    public static void main(String[] args) {
       SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

      Transaction transaction = session.beginTransaction();

        Project p = new Project();
        p.setPid(27);
        p.setPname("Meeting with help of VR");

        Emp e = new Emp();
        e.setEid(27);
        e.setEname("Vasu");
        e.setEsalary(50000);
        e.setProject(p);  
        p.setEmp(e);      

        session.save(p); 
        session.save(e);  

        transaction.commit();
        /*Emp e=  session.get(Emp.class, 25);
        System.out.println(e);
    Emp e1 = session.get(Emp.class, "e_EId");
    System.out.println(e1.getEid());
    System.out.println(e1.getEname());
    System.out.println(e1.getEsalary());*/
    
        session.close();
        sf.close();
    }
}
