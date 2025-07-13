package com.parking.UderRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.parking.Utility.HibernateUtility;
import com.practice.Entity.UserDetails;

public class CrudOperations {
	
	public void AddData() {
		UserDetails u=new UserDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
	     int id=sc.nextInt();
	     u.setId(id);
	     System.out.println("Enter flat no");
	     int flat=sc.nextInt();
	     u.setFlat_no(flat);
	     System.out.println("Enter name of owner");
	     String name=sc.next();
	     u.setName(name);
	     System.out.println("is owener");
	     boolean owener=sc.nextBoolean();
	     u.setIs_owner(owener);
	 
	SessionFactory factory=	HibernateUtility.getSessionFactory();
	
	Session session=factory.openSession();

	Transaction trans=session.beginTransaction();
	    session.persist(u);
	    
	     trans.commit();
	
	     session.close();	
	     	
	}
	
	public void GetById() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id to get data");
		int Enter_id=sc.nextInt();
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		UserDetails s=session.find(UserDetails.class, Enter_id);
		System.out.println(s.toString());
		
		session.persist(s);
		trans.commit();
		session.close();
					
	}
	
	public void UpdateData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID  to update data");
		int Enter_id=sc.nextInt();
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		UserDetails s=session.find(UserDetails.class, Enter_id);
		System.out.println("Enter flat no");
	    int flat_no=sc.nextInt();
		s.setFlat_no(flat_no);
		System.out.println("Enter name");
		String owener_name=sc.next();
		s.setName(owener_name);
		System.out.println("is owener");
		boolean is_owener=sc.nextBoolean();
		s.setIs_owner(is_owener);
		session.persist(s);
		trans.commit();
	session.close();
	
	}
	
	public void DeleteData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id that to delete data");
		int enter_id=sc.nextInt();
		
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session= factory.openSession();
		Transaction trans=session.beginTransaction();
		
		UserDetails s=session.find(UserDetails.class, 3);
		session.remove(s);
		trans.commit();
		session.close();	
	}
	
	public void GetAllData() {
		
	SessionFactory factory=HibernateUtility.getSessionFactory();
	Session session=factory.openSession();
	Transaction trans=session.beginTransaction();
	List<UserDetails> stdlist=session.createQuery("select u from UserDetails u", UserDetails.class).getResultList();
	stdlist.stream().forEach(k->System.out.println(k));
	
	trans.commit();
	session.close();
	
		
	}
	
	  
	

}
