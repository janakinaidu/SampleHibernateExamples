package naiduPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ClientForSave {

	public static void main(String[] args)
	{
		Configuration  conf=new Configuration();
		conf.configure("naiduPackage/hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Product product=new Product();
		product.setProductId(101);
		product.setPrductname("janakinaidu");
		product.setPrice(100.00);
		Transaction tx=session.beginTransaction();
		session.save(product);
		tx.commit();
		session.close();
		factory.close();
	}

}
