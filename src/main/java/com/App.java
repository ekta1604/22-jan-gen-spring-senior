package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// init ioc
//        ApplicationContext

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// ioc start
		System.out.println(context);

		StudentBean sb = context.getBean("student", StudentBean.class);
		System.out.println(sb);
		System.out.println(sb.getName());
		System.out.println(sb.getAddress().getCity());
		System.out.println(sb.getLibBean().getStream());
//
//		UserBean user1 = (UserBean) context.getBean("userBean");
//		UserBean user2 = context.getBean("userBean", UserBean.class);
////
//		System.out.println(user1);
//		System.out.println(user2);
//
//		UserDao userDao1 = context.getBean("userDao", UserDao.class);
//		System.out.println(userDao1);
//		UserDao userDao2 = context.getBean("userDao", UserDao.class);
//		System.out.println(userDao2);

		context.registerShutdownHook();// container shutdown -- release
	}
}
