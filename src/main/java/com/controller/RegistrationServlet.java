package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserBean user = new UserBean();// 500

		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);

		UserDao userDao = new UserDao();// 500
		userDao.insertUser(user);

		// which design pattern we need to use?
		// singleton

	}

}
