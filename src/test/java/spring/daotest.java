package spring;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lab.entity.test;

import org.hibernate.Session;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:application-config.xml"})
@Transactional
public class daotest {
	
	@Autowired 
	private BeanFactory bf;
	
	@Test
	public void testDataFactory() {
		
		SessionFactory sf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sf);
		Session se = sf.openSession();
		test t = new test();
		t.setNumber(444);
		Integer a = (Integer) se.save(t);
		System.out.println(a);
		se.close();
		SessionFactory sfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsf);
		SessionFactory sfsfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsfsf);
	}
}
