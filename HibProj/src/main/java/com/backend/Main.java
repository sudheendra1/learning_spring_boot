package com.backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

Student s1 = new Student();

s1.setsName("Tiger");
s1.setRollNo(48);
s1.setsAge(27);

Student s2 = null;
//To insert data into DB
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.backend.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
        //to update in DB(needs transaction, also it can be used to either update or insert the values if they dont exist)
//        session.merge(s1);

        //To delete a value from the DB(need stransaction and can also be used with find to first get the data and then delete it since it requires an entire object)
//        s2 = session.find(Student.class,46);
//        session.remove(s2);

        transaction.commit();


        //To get data from the DB with primary key(You dont need transaction for this)
//        s2 = session.find(Student.class,44);




        session.close();
        sf.close();
System.out.println(s1);
NewDB();
    }

    // Inserting objects into DB using embeddable
    public static void NewDB(){
        Alien alien = new Alien();
        Laptop laptop = new Laptop();
        laptop.setlId(1);
        laptop.setBrand("HP");
        laptop.setModel("Omen 17");
        laptop.setRam(16);
        alien.setaId(101);
        alien.setaName("Sudheendra");
        alien.setTech("Java");
        alien.setLaptop(laptop);
        Alien A1 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.backend.Alien.class).addAnnotatedClass(com.backend.Laptop.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(laptop);
        session.persist(alien);

        A1= session.find(Alien.class,101);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println("Result after find: "+A1);


    }
}
