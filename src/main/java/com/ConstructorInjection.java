package com;

import com.bean.UserBean;
import com.dao.UserDao;

public class ConstructorInjection {

	public static void main(String[] args) {

		UserBean userBean = new UserBean();
		UserDao userDao = new UserDao();

		MyApp app = new MyApp(userBean, userDao);
	}

}

//dep - > class --> class class 
//		  MyApp --> UserBean UserDao

//DI --> MyApp instance --> UserBean UserDao 
//1--> constructor injection  
//2--> setter injection 

class MyApp {

	UserBean userBean;
	UserDao userDao;

	MyApp(UserBean userBean, UserDao userDao) {
		this.userBean = userBean;
		this.userDao = userDao;
	}
	//
	//
	//

}