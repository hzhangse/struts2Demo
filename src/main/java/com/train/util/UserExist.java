package com.train.util;

public class UserExist {
   //�ж��û��Ƿ����
	     public static boolean isExist(String username, String password)
	     {
	         String name = username.trim();
	         String word = password.trim();
	        
	         if(name.equals("yuan") && word.equals("123"))
	             return true;
	         return false;
	     }
	}    