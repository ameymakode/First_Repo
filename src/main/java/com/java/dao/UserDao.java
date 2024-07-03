package com.java.dao;

public interface UserDao {


    boolean addUser(user us);
	boolean isValidUser(String username, String password);
}


