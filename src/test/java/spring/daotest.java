package spring;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lab.entity.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:application-config.xml"})
@Transactional
public class daotest {
	
	@Autowired 
	private BeanFactory bf;
	
	@Autowired
	private ApplicationContext ac;
	

	
	@Test
	public void testGetCount() {
		
		SessionFactory sf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(bf.getClass().getName());
		System.out.println(sf);
		Session se = sf.openSession();
		
		String hql = "select count(*)  from test ";
		
		Query query = se.createQuery(hql);
		
		Long a = (Long)query.iterate().next();
		
		System.out.println(a);
//		query.setFirstResult(0);
//		query.setMaxResults(8);
		
//		List<test> list = query.list();
		
//		for(test i : list) {
//			System.out.println(i.getNumber());
//		}
		
		se.close();
		SessionFactory sfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsf);
		SessionFactory sfsfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsfsf);
	}
	
	@Test
	public void testGetPageList() {
		SessionFactory sf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sf);
		Session se = sf.openSession();
		
		String hql = "from test ";
		
		Query query = se.createQuery(hql);
		
		
		query.setFirstResult(0);
		query.setMaxResults(8);
		@SuppressWarnings("unchecked")
		List<test> list = query.list();
		
		for(test i : list) {
			System.out.println(i.getNumber());
		}
		
		se.close();
		SessionFactory sfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsf);
		SessionFactory sfsfsf = (SessionFactory)bf.getBean(SessionFactory.class);
		System.out.println(sfsfsf);
		
	}
	
	
	@Test
	public void testBeanFactory() {
		System.out.println(bf.getClass().getName());
		DefaultListableBeanFactory a = new DefaultListableBeanFactory();
	}
}
