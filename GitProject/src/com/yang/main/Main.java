package com.yang.main;


import java.util.List;

import com.yang.dao.UserDao;
import com.yang.entiy.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao dao = null;
		List<User> list = dao.getUserList();
		
		for (User user : list) {
			System.out.println(user.getName()+" "+user.age()+" "user.score());
		}
	}
 
}
