package com.parking;

import java.util.Scanner;

import com.parking.UderRepository.CrudOperations;
import com.practice.Entity.UserDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    //System.out.println( "Hello World!" );
    	
    	UserDetails u=new UserDetails();
    	CrudOperations a=new CrudOperations();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 1 create data");
    	System.out.println("Enter 2 for get data by ID");
    	System.out.println("Enter 3 for update data by ID");
    	System.out.println("Enter 4 for delete data");
    	System.out.println("Enter 5 for show all data");
    	int n=sc.nextInt();
    	
    
    	switch(n) {
    	case 1:{  
    		  a.AddData();
    		  }
    	case 2:{
    		a.GetById();
    	}
    	
    	case 3:{
    		a.UpdateData();
    	}
    	case 4:{
    		a.DeleteData();
    	}
    	case 5:{
    		a.GetAllData();
    	}
    	}
    	
    	
    }
}
