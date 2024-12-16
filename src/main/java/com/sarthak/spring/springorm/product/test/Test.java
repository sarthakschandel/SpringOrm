package com.sarthak.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarthak.spring.springorm.product.dao.ProductDao;
import com.sarthak.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");

		/*
		 * Product product = new Product(); product.setId(1); product.setName("Iphone");
		 * product.setDesc("Its awesome!!"); product.setPrice(800);// originally was 700
		 */

		// productDao.create(product);
		/*
		 * Hibernate: insert into Product (description, name, price, id) values (?, ?,
		 * ?, ?)
		 */

		// productDao.update(product);
		/* Hibernate: update Product set description=?, name=?, price=? where id=? */

		// productDao.delete(product);
		/*
		 * Hibernate: select product_.id, product_.description as descript2_0_,
		 * product_.name as name3_0_, product_.price as price4_0_ from Product product_
		 * where product_.id=? Hibernate: delete from Product where id=?
		 */

		//Product product = productDao.find(1);
		//System.out.println(product);
		/*
		 * Hibernate: select product0_.id as id1_0_0_, product0_.description as
		 * descript2_0_0_, product0_.name as name3_0_0_, product0_.price as price4_0_0_
		 * from Product product0_ where product0_.id=? 
		 * Product [id=1, name=Iphone,desc=Good, price=800.0]
		 */
		
		List<Product> products = productDao.findAll();
		System.out.println(products);
		/*
		 * Hibernate: select this_.id as id1_0_0_, this_.description as descript2_0_0_, this_.name as name3_0_0_, this_.price as price4_0_0_ from Product this_
		 * 
		[Product [id=1, name=Iphone, desc=Good, price=800.0], Product [id=2, name=MacBook, desc=Good, price=1400.0]]
		 */

	}

}
