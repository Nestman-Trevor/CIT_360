package hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;			//Library for hibernate, don't have set up
import org.hibernate.cfg.Configuration;			//Library for hibernate.
import hibernateTest.WaterDay;

public class HibernateMainTest {

	public static void main(String[] args) {
		WaterDay userName = new WaterDay();
		userName.setId(2);
		userName.setUserName("Rob");
		userName.totalWater(11);
		
		//will create a table and set the values on the table.
		//Remember that the id is the PK integer
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userName);
		session.getTransaction().commit();
		
	}
	

}
