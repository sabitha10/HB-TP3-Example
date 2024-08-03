package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPCExample {
	public static void main(String[]args) {
		
		
		Transaction tr = null;
		try (Session ses =HBUtil.getSessionFactory().openSession() ){
			tr=ses.beginTransaction();
			Employee e1 = new Employee("Janani");
			RegEmployee e2 = new RegEmployee("Anita",50000,"ExecutiveOfficer");
			Trainee e3 = new Trainee("Nime",200,"2 months");
			
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			
			tr.commit();
			ses.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
